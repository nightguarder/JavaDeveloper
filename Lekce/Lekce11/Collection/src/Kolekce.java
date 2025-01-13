import java.util.ArrayList; //Importování třídy ArrayList
import java.util.LinkedList;
import java.util.List;
class Osoba {
    public Osoba(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getName() {
        return jmeno;
    }

    private String jmeno;
}
public class Kolekce {
    public static void showSeznam(List seznam) {
        for (int i = 0; i < seznam.size(); i++) {
            System.out.println(seznam.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //List nepracuje s konkréními prvky ale pouze s odkazy na ně
        List seznam = new ArrayList<>(); //Do proměnné Seznam se ukládá nový objekt třídy Arraylist
        seznam.add("První"); //Přidání prvního prvku do seznamu
        seznam.add("Druhý");
        showSeznam(seznam); //Zavolání metody showSeznam
        System.out.println(seznam.size()); //Vypsání velikosti seznamu
        System.out.println(seznam.get(0)); //Vypsání prvního prvku seznamu
        seznam.remove(0); //Odstranění prvního prvku seznamu
        //seznam.clear(); //Vymazání všech prvků v seznamu
        //Pro optimalizaci kódu je lepší použít již vytvořený seznam
        //Novy prvek se vlozi na misto odstraneneho
        seznam.add(0, "Nový první");
        showSeznam(seznam);

        
        /* Pretypovani tridy Osoba a prirazeni jej do seznamu */
        System.out.println("//Pretypovani tridy Osoba a prirazeni jej do seznamu");
        List seznamOsob = new ArrayList<>();
        seznamOsob.add(new Osoba("Petr"));
        seznamOsob.add(new Osoba("Jana"));

        Osoba o = (Osoba) seznamOsob.get(0);

        System.out.println(o.getName());

        System.out.println(seznamOsob);

    }
    
}
