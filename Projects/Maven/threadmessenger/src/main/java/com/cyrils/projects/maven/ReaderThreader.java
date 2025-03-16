package com.cyrils.projects.maven;

import java.io.PipedReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReaderThreader extends Thread {
    private BufferedReader reader;

    public ReaderThreader(PipedReader reader) {
        this.reader = new BufferedReader(reader);
    }

    @Override
    public void run() {
        try {
            String line;
            while ((line = reader.readLine()) != null) { // Read until the end of the stream
                try {
                    Message message = MessageSerialization.deserialize(line);
                    // Process the message based on its type
                    switch(message.getType()) {
                        case DATA:
                            System.out.println("Received data: " + message.getPayload());
                            break;
                        case COMMAND:
                            if(message.getPayload().equals("konec")) {
                                // Handle termination
                                System.out.println("Received termination message...\n \n");
                                return;
                            }
                        case WARNING:
                            System.out.println("Received warning: " + message.getPayload());
                        case ERROR:
                            System.out.println("Received error: " + message.getPayload());
                        default:
                            break;
                        // Handle other types...
                    }
                } catch (IOException e) {//handle serialization errors
                    System.out.println("An error occurred on Reader Thread: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
