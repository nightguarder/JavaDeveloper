public class OVerrideClass extends OVerride{
    
    @Override
    public void sayHello(String name){
        //Dalsi akce pred volanim rodicovske metody
        super.sayHello(name);
        System.out.println("Called from OVerrideClass...");
        System.out.println("Goodbye " + name);
    }
    
    
}
