//Rodic class
public class Animal {
    String color;

    //Created by default java compiler
    /* public Animal() {
        super(); // Implicit call to the parent class (Object)
    } */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    
}

