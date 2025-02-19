public class Lion extends Animal{
    String jungleName;

    public String getJungleName() {
        return jungleName;
    }
    public void setJungleName(String jungleName) {
        this.jungleName = jungleName;
    }
    public void eat(){
        System.out.println("Lion is eating");
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
}
