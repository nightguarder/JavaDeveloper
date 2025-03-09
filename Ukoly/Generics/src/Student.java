//Vytvořte Třídu Student s parametry jmeno, prijmeni, rokNarozeni. Implementujte metody hashCode a equals. 
public class Student {
    String jmeno;
    String prijmeni;
    int rokNarozeni;
    //konstruktor
    public Student(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }
    //metoda hashCode aby poznala duplicates 
    @Override
    public int hashCode() {
        return jmeno.hashCode() + prijmeni.hashCode() + rokNarozeni;
    }
    //metoda equals aby porovnala dva objekty
    @Override
    public boolean equals(Object student) {
        //pokud je reference this a student stejna
        if (this == student) 
            return true;
        //porovnej zda je student null nebo zda je to jiny typ
        if (student == null || getClass() != student.getClass())
            return false;

        //pokud vse ok tak pretypuj na Student
        Student other = (Student) student;
        //porovnej jmeno, prijmeni a rok narozeni
        return rokNarozeni == other.rokNarozeni && jmeno.equals(other.jmeno) && prijmeni.equals(other.prijmeni);
    }
    //Bonus: lepší metoda equals
    //používat k porovnání Objects.equals pro Ošetření null hodnot stringu a proměnných
    //@Override
    public boolean equalsBetter(Object student) {
        if (this == student) return true;
        if (student == null || getClass() != student.getClass()) return false;
        Student other = (Student) student;
        return rokNarozeni == other.rokNarozeni 
            && jmeno.equals(other.jmeno) 
            && prijmeni.equals(other.prijmeni);
    }
    public String toString() {
        return jmeno + " " + prijmeni + " " + rokNarozeni;
    }
}
