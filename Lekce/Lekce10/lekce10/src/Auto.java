public class Auto implements Vozidlo, Spotreba{
    private int x, y; //jiz je mozne vytvorit lokalni promenne
    private int prevX, prevY; //store the previous coordinates
    private final double spotreba_auta = 0.5; //fuel consumption per kilometer
    //Je nutne implementovat vsechny metody z rozhrani Vozidlo 
    @Override
    public void pohybujSe(int x, int y) {
        //store the previous coordinates first
        this.prevX = this.x;
        this.prevY = this.y;
        System.out.println("Auto se pohybuje z: " + prevX + " " + prevY);
        //set the new coordinates
        this.x = x;
        this.y = y;
        System.out.println("Auto se pohybuje na souradnice x: " + x + " y: " + y);
        
    }
    //nebo si pridej vlastni metody
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    @Override
    public String lokace() {
        return "Lokace auta je: " + x + " " + y;
    }
    @Override
    public void zastav() {
        System.out.println("Auto se zastavilo");
        
    }
    @Override
    public double spotreba_paliva() {
        //Calculate the fuel consumption from the distance traveled
        //prevX, prevY, x, y
        double distance = Math.sqrt(Math.pow((x - prevX), 2) + Math.pow((y - prevY), 2));
        return distance * spotreba_auta; //pouzijeme private promennou spotreba_auta

    }

    
}
class Test{
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.pohybujSe(10, 20);
        System.out.println(auto.lokace());
        System.out.println("Spotreba paliva: " + auto.spotreba_paliva() + "l");

        System.out.println("-------------------");

        auto.pohybujSe(30, 40);
        System.out.println(auto.lokace());
        System.out.println("Spotreba paliva: " + auto.spotreba_paliva() + "l");

        //vlastni metoda getX()
        /* //get the x coordinate
        System.out.println("X coordinate: " + auto.getX());
        //get the y coordinate
        System.out.println("Y coordinate: " + auto.getY()); */
        
        auto.zastav();
        System.out.println("\n-------------------");
        Kolo kolo = new Kolo();
        System.out.println(kolo.lokace());
        kolo.pohybujSe(30, 40);
        System.out.println(kolo.lokace());
    }
}
class Kolo implements Vozidlo{
    private int x, y;
    @Override
    public void pohybujSe(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Kolo se pohybuje na souradnice x: " + x + " y: " + y);
    }
    public void zastav(){
        System.out.println("Kolo se zastavilo");
    }
    public String lokace(){
        return "Lokace kola je: " + x + " " + y;
    }
}
