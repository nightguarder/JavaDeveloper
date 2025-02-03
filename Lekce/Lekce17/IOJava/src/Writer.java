import java.io.FileWriter;
public static final char[] DATA_TO_WRITE = new char[] {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'}; //pole znaku k zapsani

public class Writer {
    public static void main(String[] args) {
        FileWriter file = new FileWriter("src/output.txt");
        //file.write("Hello, World!");
        //nebo
        file.write(DATA_TO_WRITE);
        file.close();

        //Nebo char writer
        //Interne pouziva StringBuffer a zapisuje do nej znaky
        CharArrayWriter writer = new CharArrayWriter(64); //inicializace pole s velikosti bufferu 64 
        writer.write("text co se zapise do pole");
        //Vrat nam pole znaku
        char[] vyslednePole = writer.toCharArray();
    }
    
}
