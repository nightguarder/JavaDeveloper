//Vytvořte program který vytvoří List a uloží do něj seznam studentů(String). 
//Poté pomocí indexu odeberte studenta co už není v kurzu. Poté projděte seznam a oveřte zda opravdu daný student není v kurzu a výsledek vypište na obrazovku.

import java.util.ArrayList;
import java.util.List;

public class StudentSet<T> {
    private List<T> studenti = new ArrayList<>(10);
    private List<String> kurzyList = new ArrayList<>(10);
    
    public void addStudent(T student) {
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
            T student = studenti.get(i);
            System.out.println("Student " + student + " je zapsán v kurzu: " + kurzyList.get(i));
        }
    }
    
    public static void main(String[] args) {
        // Using with String type
        StudentSet<String> stringStudentSet = new StudentSet<>();
        stringStudentSet.addStudent("Petr");
        stringStudentSet.addStudent("Jana");
        stringStudentSet.addStudent("Karel");
        
        stringStudentSet.removeStudent(2);
        
        stringStudentSet.addKurz("Matematika");
        stringStudentSet.addKurz("Fyzika");
        stringStudentSet.addKurz("Data Mining");
        
        stringStudentSet.removeKurz(2);
        
        stringStudentSet.printResult();
        
        // Example with Student class
        System.out.println("\nPříklad se třídou Student:");
        StudentSet<Student> studentStudentSet = new StudentSet<>();
        studentStudentSet.addStudent(new Student("Petr", "Novák", 1995));
        studentStudentSet.addStudent(new Student("Jana", "Veselá", 1998));
        
        studentStudentSet.addKurz("Matematika");
        studentStudentSet.addKurz("Fyzika");
        
        studentStudentSet.printResult();
    }
}
