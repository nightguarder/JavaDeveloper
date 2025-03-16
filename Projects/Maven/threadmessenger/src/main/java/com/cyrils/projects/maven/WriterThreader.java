package com.cyrils.projects.maven;

import java.io.IOException;
import java.io.PipedWriter;

import com.cyrils.projects.maven.Message.MessageType;

public class WriterThreader extends Thread {
    private PipedWriter writer;

    public WriterThreader(PipedWriter writer) {
        this.writer = writer;
    }
    @Override
    public void run() {
        try {
            //create a new message
            Message message = new Message(MessageType.DATA, "First test", "Cyril", "Everyone");
            //serialize the message
            String jsonMessage = MessageSerialization.serialize(message);
            //write the message to the writer
            writer.write(jsonMessage);
            writer.write("\n"); 
            writer.flush();
            //try the command
            message = new Message(MessageType.COMMAND, "konec", "Cyril", "Everyone");
            jsonMessage = MessageSerialization.serialize(message);
            writer.write(jsonMessage);
            writer.write("\n");
            writer.flush();
            
        } catch (IOException e) {
            System.out.println("An error occurred on Writer Thread: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
