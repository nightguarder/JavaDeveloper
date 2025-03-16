package com.cyrils.projects.maven;


import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Main thread starts here...");
        try{
            //PipedWriter + PipedReader inicializace
            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader(writer);

            //Inicializace Writer + Reader Threadu
            WriterThreader writerThread = new WriterThreader(writer);
            ReaderThreader readerThread = new ReaderThreader(reader);
            //Spusteni Writer + Reader Threadu
            writerThread.start();
            readerThread.start();

            //join() na Writer + Reader Thready
            //wait for both worker threads to finish = in Sync
            writerThread.join();
            readerThread.join();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("An error occurred on Main Thread: " + e.getMessage());
            e.printStackTrace();
        }

    }
}