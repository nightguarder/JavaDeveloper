package com.cyrils.java.ukoly;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

public class SecretFile {
    // Either set a default value or use the computed hash from the output
    private static final String EXPECTED_HASH = System.getenv("EXPECTED_HASH") != null ? 
        System.getenv("EXPECTED_HASH") : "fada5d5e2c76ded0d873d1ad987339a4a9de57c77ec0ab740a386cfb866507ba";

    private static final List<String> ENCODINGS = Arrays.asList(
            "IBM861", "Cp869", "Cp500", "IBM870", "IBM284"
    );
    
    public static void main(String[] args) {
        try {
            // Generate secret text file from the dopis.bin file
            String inputFilename = "dopis.bin";
            String outputFilename = "tajny.txt"; // in UTF-8
            
            // First verify the file hash
            if(!verifyInputFile(inputFilename)) {
                return;
            }
            
            // Process the file if verification passes
            processFile(inputFilename, outputFilename);
            
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    private static boolean verifyInputFile(String inputFilename) {
        try {
            // Verify binary file
            if(!verifyFile.verifySha256(inputFilename, EXPECTED_HASH)) {
                System.out.println("File " + inputFilename + " is not valid.");
                System.err.println("Soubor mohl být poškozen nebo změněn.");
                return false;
            }
            return true;
        } catch (IOException e) {
            System.err.println("Chyba při čtení souboru: " + e.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Chyba při výpočtu SHA-256 hashe: " + e.getMessage());
            return false;
        }
    }
    

    private static void processFile(String inputFilename, String outputFilename) {
        try {
            // Read binary file
            Path path = Paths.get(inputFilename);
            byte[] binaryData = Files.readAllBytes(path);
            
            // Find a valid encoding first
            String validEncoding = ConvertFileEncodings.findValidEncoding(binaryData, ENCODINGS);
            
            if (validEncoding != null) {
                System.out.println("Nalezeno platné kódování: " + validEncoding);
                // If we found a valid encoding, save the converted file
                boolean saved = ConvertFileEncodings.saveConvertedFile(binaryData, outputFilename, validEncoding);
                if (saved) {
                    System.out.println("Soubor " + outputFilename + " byl úspěšně vytvořen s kódováním " + validEncoding);
                } else {
                    System.out.println("Nepodařilo se uložit soubor " + outputFilename);
                }
            } else {
                System.out.println("Pro soubor " + inputFilename + " nebylo nalezeno žádné platné kódování");
            }
        } catch (IOException e) {
            System.err.println("Chyba při čtení nebo zápisu souboru: " + e.getMessage());
        }
    }
}
