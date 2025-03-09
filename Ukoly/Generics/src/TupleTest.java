import java.util.HashSet;
import java.util.Set;

public class TupleTest {
    public static void main(String[] args) {
         Set<Tuple<Integer, String>> set = new HashSet<>();
        set.add(new Tuple<>(1, "První"));
        set.add(new Tuple<>(2, "Druhý"));

        Tuple<Integer, String> duplicate = new Tuple<>(1, "První");
        System.out.println("Obsahuje množina duplikát? " + set.contains(duplicate));

        boolean added = set.add(duplicate);
        System.out.println("Byl duplikát přidán? " + added);

        boolean removed = set.remove(new Tuple<>(2, "Druhý"));
        System.out.println("Byl prvek odstraněn? " + removed);
        System.out.println("Aktuální množina: " + set);
    }   
    
}
