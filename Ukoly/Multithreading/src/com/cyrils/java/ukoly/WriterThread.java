package com.cyrils.java.ukoly;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PipedWriter;

//Thread managed by MainThread
public class WriterThread extends Thread {
    private final PipedWriter writer;
    
    //Konstruktor
    public WriterThread(PipedWriter writer) {
        this.writer = writer;
    }
    @Override
    public void run() {
        try {
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("Message from WriterThread \n");//posílání zpráv nezapoměňte odeslat nový řádek. “\n”
            bufferWriter.flush(); //flush() - zajištění, že se všechny data odešlou
            
            //pause for 1 second
            Thread.sleep(1000);
            bufferWriter.write("Another message from WriterThread \n");
            bufferWriter.flush();


            Thread.sleep(1000);
            //*Čtecí vlákno musí po obdržení zprávy “konec” ukončit svůj běh
            bufferWriter.write("konec\n");
            bufferWriter.flush();
            bufferWriter.close();
            //close the writer
            System.out.println("WriterThread has ended");
            
        } catch (IOException | InterruptedException e) {
            System.out.println("WriterThread error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
