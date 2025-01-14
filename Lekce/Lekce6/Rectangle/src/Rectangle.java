//
//Pokud je metoda zavolána s neplatnými hodnotami, vytiskněte co je špatně a ukončete metody pomoci return.
public class Rectangle {
    //While loop
    public static void printRectangleWhile(int height, int width) {
        if (height <= 0 || width <= 0) {
            System.out.println("Invalid input. Height and width must be greater than 0.");
            return;
        }
        //the size of Interger.MAX_VALUE is determined by the compiler
        //https://stackoverflow.com/questions/15004944/max-value-of-integer#answer-15005226
        else if (height >= Integer.MAX_VALUE || width >= Integer.MAX_VALUE) {
            System.out.println("Invalid input. Height and width must be less than INT_MAX.");
            return;
        }
        else {
            int i = 0;

            while (i <= height) {
                if (i == 0 || i == height) { //first and last line
                    for (int j = 0; j <= width; j++) {
                        System.out.print('*');
                    }
                    System.out.print('\n');
                    i++;
                    continue;
                }
                else { //middle lines
                    for (int k = 0; k <= width; k++) {
                        if (k == 0 || k == width) {
                            System.out.print('*');
                            continue;
                        }
                        System.out.print(' '); //mezery
                    }
                    System.out.print('\n');
                    i++; //next line
                    }
            }//end while
        }
    }
    //For loop
    //Metoda bude mit dva parametry, vyska, sirka.
    public static void printRectangle(int height, int width) {
        if (height <= 0 || width <= 0) {
            System.out.println("Nespravny vstup. Vyska a sirka musi byt vetsi nez 0.");
            return;
        }
        //the size of Interger.MAX_VALUE is determined by the compiler
        //https://stackoverflow.com/questions/15004944/max-value-of-integer#answer-15005226
        else if (height >= Integer.MAX_VALUE || width >= Integer.MAX_VALUE) {
            System.out.println("Nespravny vstup. Vyska a sirka musi byt mensi nez INT_MAX.");
            return;
        }
        else {
            for (int i = 0; i <= height; i++) {
                if (i == 0 || i == height) { //prvni a posledni radek
                    for (int j = 0; j <= width; j++) {
                        System.out.print('*');
                    }
                    System.out.print('\n');
                    continue;
                }
                else { //middle lines
                    for (int k = 0; k <= width; k++) { 
                        if (k == 0 || k == width) { //prvni a posledni znak
                            System.out.print('*');
                            continue;
                        }
                        System.out.print(' '); //mezery
                    }
                    System.out.print('\n');
                }
                //System.out.print('\n');
            }
        }
    } 


    public static void main(String[] args) throws Exception {
        System.out.println("Rectangle");
        //Call the print * method
        printRectangle(5, 10);
        //Call with invalid parameters
        //printRectangle(-5, 10);
        //printRectangle(5, -10); 
        //printRectangleWhile(5, 10);
    }
}
