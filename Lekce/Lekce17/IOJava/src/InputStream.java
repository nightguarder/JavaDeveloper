import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HexFormat;

public class InputStream {
    private static final HexFormat HEX_FORMAT = HexFormat.ofDelimiter("");

    public static void main(String[] args) throws FileNotFoundException {
        //Read line from user
        System.console().readLine();
        FileInputStream file = new FileInputStream("src/InputStream.java");//nejpouzivanější třída pro čtení bytů ze souboru
        byte[] buff = new byte[1024]; //manualne alokovany buffer
        int read = 0;

        try {
            while ((read = file.read(buff)) != -1) { //run until EOF
                System.out.printf("Bytes Read: %d", read );
                System.out.println(HEX_FORMAT.formatHex(buff, 0, read));
                System.out.println("\n");

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //vzdy je potreba zavrit soubor jelikož java nevi kdy jsme s ním skončili
    }
    
}
