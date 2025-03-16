package com.cyrils.java.ukoly;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class MainThread {
    public static void main(String[] args) throws IOException {
        try{
            //PipedWriter + PipedReader inicializace
            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader(writer);

            //Inicializace Writer + Reader Threadu
            WriterThread writerThread = new WriterThread(writer);
            ReaderThread readerThread = new ReaderThread(reader);

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
        System.out.println("Thread initialization finished");
    }
}
