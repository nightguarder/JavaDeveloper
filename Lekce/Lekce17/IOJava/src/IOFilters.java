import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class IOFilters {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        //BufferedReader - cteni znaku z Readeru
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(
                new FileInputStream("src/input.txt"), "UTF-8")
                ); //Pridaní bufferu pro cteni znaku

        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) { //cti do konce souboru
                System.out.println("Read line: " + line.length() +"\n" + line);
                
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //BufferedWriter - zapis znaku do Writeru
        //BufferedInputStream - cteni bytu z InputStreamu
        //BufferedOutputStream - zapis bytu do OutputStreamu   
    }
    
}
