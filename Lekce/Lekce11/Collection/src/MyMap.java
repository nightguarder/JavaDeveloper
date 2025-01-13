import java.util.HashMap;
import java.util.Map;

public class MyMap {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Map m = new HashMap();
        //Mapa = Klic + hodnota
        //Mapa = {CZ = "Ceska republika", SK = "Slovenska republika"}

        m.put("CZ", "Ceska republika"); //Pozor ne add ale put
        m.put("SK", "Slovenska republika");
        //setrideni podle klice, ale nespoléhat na to
        System.out.println(m); //Vypíše všechny prvky bez duplicitních
        
        //Vypsání hodnoty podle klíče
        String czech = (String) m.get("CZ");
        System.out.println(czech);
        System.out.println("//-----------------");


        //Prochazeni hodnot např("Ceska republika") mapy pomoci foraeach Iterable
        System.out.println("Pouze hodnoty z mapy:");
        for(Object key : m.values()) {
            System.out.println(key);
        }
        //keySet vraci mnozinu klicu
        System.out.println("Pouze klice z mapy:");
        for (Object key : m.keySet()) {
            System.out.println(key);
        }
        // má metody hashCode a equals
        System.out.println("Klic a hodnota:");
        for (Object key : m.entrySet()) {
            System.out.println(key);
        }
        //TODO: Vlastni trida ktera reporezentuje objeck klic a implementovat metody equals a hashCode

        
    }
    
}
