package com.cyrils.java.ukoly;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class verifyFile {
    public static boolean verifySha256(String inputFilename, String expectedHash) throws IOException, NoSuchAlgorithmException {
        Path path = Paths.get(inputFilename);
        byte[] data = Files.readAllBytes(path);

        //Calculate SHA-256 hash
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(data);

        //Convert byte array to hex string
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        //back to string
        String convertedHash = hexString.toString();
        System.out.println("Vypočítaný hash: " + convertedHash);
        System.out.println("Očekávaný hash:  " + expectedHash);

        // Also handle null expectedHash value
        return expectedHash != null && convertedHash.equals(expectedHash);   
    }


}