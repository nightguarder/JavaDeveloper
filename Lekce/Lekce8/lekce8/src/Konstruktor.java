public class Konstruktor {
    boolean status;

    // Default constructor
    public Konstruktor() {
        status = true;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        //klicove slovo this
        //slouzi pro pristup k instanci proměnných
        this.status = status;
    }
    // Constructor s parametry
    public Konstruktor(boolean defaultState) {
        status = defaultState;
    }
    public static void main(String[] args) {
        Konstruktor instance = new Konstruktor();
        System.out.println("Default stav konstruktoru:");
        System.out.println(instance.status);
        
        System.out.println("Změna statusu přes setter na false: ");
        instance.setStatus(false);
        System.out.println(instance.status);        
    }
}