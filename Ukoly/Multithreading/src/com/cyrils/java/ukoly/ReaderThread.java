package com.cyrils.java.ukoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;

//extends java.lang.Thread
public class ReaderThread extends Thread {
    private final PipedReader reader;
    public ReaderThread(PipedReader reader) {
        this.reader = reader;
    }
    @Override
    public void run() {
        try {
            BufferedReader bufferReader = new BufferedReader(reader);
            String msg;

            while ((msg = bufferReader.readLine()) != null) {
                if (msg.equals("konec")) 
                {
                    System.out.println("Received termination message...\n \n");
                    break;
                }
                System.out.println("Received message: " + msg);
            }
            bufferReader.close(); //?StreameReader is closed automatically with try-catch
            System.out.println("ReaderThread has ended");

        } catch (IOException e) {
            System.out.println("ReaderThread error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    
}
