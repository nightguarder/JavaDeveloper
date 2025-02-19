// Subclass implementing the abstract method
public class SubClass extends AbstractClass {
    // Implementation of the abstract method
    @Override //proc override? --> polymorfismus
    //This allows SubClass to behave differently from AbstractClass when abstractMethod is called.
    public void abstractMethod() {
        //You can do differen logic than in AbstractClass
        System.out.println("This is the implementation of the abstract method from subclass class.");
    }

    public static void main(String[] args) {
        //vytvoreni instance tridy
        SubClass subclass = new SubClass();
        // volani abstraktni metody
        subclass.abstractMethod();
    }
}
