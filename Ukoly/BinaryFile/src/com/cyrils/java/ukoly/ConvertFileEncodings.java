package com.cyrils.java.ukoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ConvertFileEncodings {
    
    /**
     * Checks if the input binary data can be properly decoded using any of the provided encodings
     * @param binaryData The binary data to be decoded
     * @param encodings List of encodings to try
     * @return The valid encoding name if found, otherwise null
     */
    public static String findValidEncoding(byte[] binaryData, List<String> encodings) {
        for (String encoding : encodings) {
            try {
                String decodedText = new String(binaryData, encoding);
                // Check if the decoded text contains valid characters
                String preview = decodedText.length() > 200 ? 
                                decodedText.substring(0, 200) + "..." : 
                                decodedText;
                System.out.println("Náhled obsahu:");
                System.out.println(preview);
                
                // Dotaz uživateli
                System.out.print("\nJe text čitelný? (ano/ne): ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String answer = reader.readLine().trim().toLowerCase();
                if (answer.equals("ano")) {
                    // Found a valid encoding
                    // Don't try to get the encoding name from Charset.availableCharsets() as that's a different list
                    // Just return the current encoding we're testing
                    System.out.println("Found valid encoding: " + encoding);
                    return encoding; 
                }
                // If the user answers "ne", try the next encoding
                else if (answer.equals("ne")) {
                    System.out.println("Další pokus s kódováním: " + encoding);
                }
                else {
                    System.out.println("Neplatná odpověď. Zkuste to znovu.");
                }
            } catch (Exception e) {
                // If this encoding fails, just try the next one
                continue;
            }
        }
        return null; // No valid encoding found
    }
    
    
    public static boolean saveConvertedFile(byte[] binaryData, String outputFilename, String encoding) {
        try {
            String decodedText = new String(binaryData, encoding);
            Path outputPath = Paths.get(outputFilename);
            // Save the decoded text using UTF-8 encoding
            Files.write(outputPath, decodedText.getBytes("UTF-8"));
            return true;
        } catch (IOException e) {
            System.err.println("Error saving converted file: " + e.getMessage());
            return false;
        }
    }
    
    // This method is called from SecretFile.java
    public static boolean convertFile(byte[] binaryData, String outputFilename, List<String> encodings) {
        String validEncoding = findValidEncoding(binaryData, encodings);
        if (validEncoding != null) {
            System.out.println("Found valid encoding: " + validEncoding);
            return saveConvertedFile(binaryData, outputFilename, validEncoding);
        } else {
            System.out.println("No valid encoding found among the provided options");
            return false;
        }
    }
}
