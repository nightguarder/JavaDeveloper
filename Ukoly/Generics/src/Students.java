import java.util.HashSet;
import java.util.Set;

public class Students {
    private static void printSet(Set<Student> studenti) {
        for (Student student : studenti) {
            System.out.println(student);
        }
    }
    
    private static void printSetSize(Set<?> set) {
        System.out.println("Velikost setu: " + set.size());
    }
    
    private static void printAddResult(boolean result, String studentName) {
        System.out.println("Podařilo se přidat studenta " + studentName + " do množiny? " + result);
    }
    
    public static void main(String[] args) throws Exception {
        //Následně vytvořte instance několika studentů a vložte je to množiny Set. Poté vytvořte nové instance už existujícíh studentů a ověřte zdali se nacházejí v dané množině
        Set <Student> studenti = new HashSet<>();
        studenti.add(new Student("Petr", "Novák", 1990));
        studenti.add(new Student("Jana", "Kovářová", 1991));

        Student other = new Student("Karel", "Nový", 1992);
        System.out.println("Je student Karel Nový v množině? " + studenti.contains(other));
        printSetSize(studenti); //2

        //trying to add Duplicates 
        boolean pridat = studenti.add(other);
        printAddResult(pridat, "Karla Nového");
        Students.printSet(studenti);
        printSetSize(studenti);
        System.out.println("\n");

        boolean pridat2 = studenti.add(new Student("Karel", "Nový", 1992));
        printAddResult(pridat2, "Karel Nový");
        Students.printSet(studenti);
        printSetSize(studenti);
        System.out.println("\n");
    }
}
