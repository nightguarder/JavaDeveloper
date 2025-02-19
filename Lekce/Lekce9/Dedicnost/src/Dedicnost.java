public class Dedicnost {
    //Usage of class inheritance
    //Class Animal with its children Dog and Lion 
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal();
        animal.eat();
        
        Dog dog = new Dog();
        dog.bark(); //metoda je definovana pouze ve tride Dog
        //dog.color = "Black"; //toto je mozne pouze pokud color je public
        //Lepsi je pouzit setter
        dog.setColor("Black"); 
        dog.setOwner("Cyril");
        System.out.println("Dog color: " + dog.color + " Dog owner: " + dog.owner);
        /* Pozor
         * metoda getColor a getOwner je definovana pouze ve tride Animal a nema zavislost na tride Dog
         */
        dog.getColor(); 
        dog.getOwner();

        //*---------------------------- */
        //To same muzeme udelat u Lion
        Lion lion = new Lion();
        //lion.jungleName = "Africa";
        //lion.color = "White";
        lion.setJungleName("Africa");
        lion.setColor("White");
        System.out.println("Lion color: " + lion.color + " Jungle name: " + lion.jungleName);
        lion.getJungleName();
        lion.roar();
        lion.eat();

        //*---------------------------- */
        //subtrida Dog muze mit i vice potomku
        BostonTerrier bostonTerrier = new BostonTerrier();
        barking(bostonTerrier);
        //nebo 
        Dog ddd = new BostonTerrier();
        barking(ddd);

    }
    public static void barking (Dog dog){ 
        System.out.println(dog + " is barking");
    }
}
        
