//Potomek tridy Animal
//Musi byt v separate file
public class Dog extends Animal {
    String owner;

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class BostonTerrier extends Dog{
    public void bark (Dog dog){ //zavola na metodu bark z objektu dog
        System.out.println("Boston Terrier is barking");
    }
}
