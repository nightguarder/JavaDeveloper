//Vytvořte program který vytvoří List a uloží do něj seznam studentů(String). 
//Poté pomocí indexu odeberte studenta co už není v kurzu. Poté projděte seznam a oveřte zda opravdu daný student není v kurzu a výsledek vypište na obrazovku.

import java.util.ArrayList;
import java.util.List;

public class StudentSet {
    private List <String> studenti = new ArrayList<>();
    private List <String> kurzyList = new ArrayList<>();
    public void addStudent(String student) {
        studenti.add(student);
    }
    public void removeStudent(int index) {
        studenti.remove(index);
    }
    public void addKurz(String kurz) {
        kurzyList.add(kurz);
    }
    public void removeKurz(int index) {
        kurzyList.remove(index);
    }
    public void printResult() {
        for (int i = 0; i < studenti.size(); i++) {
            String student = studenti.get(i);
            System.out.println("Student " + student + " je zapsán v kurzu: " + kurzyList.get(i));
        }
    }
    public static void main(String[] args) {
        StudentSet studentSet = new StudentSet();
        studentSet.addStudent("Petr");
        studentSet.addStudent("Jana");
        studentSet.addStudent("Karel");//odebereme Karla
        
        studentSet.removeStudent(2);//remove at index 2

        //*zalezi na poradi? 
        //ANO, zalezi na poradi, protoze se to uklada do dvou ruznych listu
        //*studentSet.addKurz("Angličtina");
        studentSet.addKurz("Matematika");
        studentSet.addKurz("Fyzika");
        studentSet.addKurz("Data Mining");

        studentSet.removeKurz(2);//remove at index 2

        studentSet.printResult();
    }
}
