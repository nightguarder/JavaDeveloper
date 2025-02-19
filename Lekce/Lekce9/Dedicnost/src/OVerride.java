public class OVerride {
    public void sayHello(String name){
        System.out.println("Hello " + name);
    }  
    public static void main(String[] args) {
        /* OVerride ov = new OVerride();
        ov.sayHello("Cyril"); */

        //Override the method sayHello
        //but dont change the method signature
        OVerrideClass ovc = new OVerrideClass();
        ovc.sayHello("Cyril");
    }
}
