import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    //Iterable List 
    public static void main(String[] args) {

        List seznam = new ArrayList<>();
        seznam.add("Pivo");
        seznam.add("Vino");
        seznam.add("Vodka");
        
        //Iterator
        Iterator it = seznam.iterator();
        //While
        while (it.hasNext()) {
            System.out.println(it.next()); //pred pouziitim next() je nutne zavolat hasNext()
        }
        //For
        System.out.println("For");
        for (int i = 0; i < seznam.size(); i++) {
            System.out.println(seznam.get(i));
        }
        //nebo ForEach
        System.out.println("ForEach:");
        for(Object el : seznam) {
            System.out.println(el);
        }


    }
}