import java.io.FileReader;
import java.nio.charset.Charset;

public class Reader {
    public static void main(String[] args) {
        Reader reader = new FileReader("src/input.txt", Charset.defaultCharset()); //nejpouzivanější třída pro čtení znaků ze souboru
        //s defaultnim kodovanim znaku
        //defaultni je pro kazdou platformu jiny (napr. pro windows je to windows-1250)
        char[] buff = new char[16]; //cteme po 16 bytech

        int read = 0;

        while ((read = reader.read(buff)) != -1) { //run until EOF
            System.out.printf("Chars Read: %d", read);
            for (int i = 0; i < read; i++) {
                System.out.print(buff[i]);
            }
            System.out.println("\n");
        }
        reader.close(); //Nezapomenout uzavrit aby nedosla pamet bufferu :) 
    }
    
}
