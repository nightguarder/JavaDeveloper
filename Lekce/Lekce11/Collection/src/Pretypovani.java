public class Pretypovani {
    //TODO: Fix class Osoba
    static class Osoba { //musi byt static pro pristup z main
        
        private String name;

        public Osoba(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Toto je třída Osoba";
        }
    }
    public static void main(String[] args) {
        Osoba petr = new Osoba("Petr"); 

        //Osoba str = "Stringosobaobject"; //Cannot convert from String to Osoba
        //String o = str.toString();    //Cannot convert from String to Osoba
        //Object pretypovat = o; 

        System.out.println(petr);

        Osoba pretypovano = (Osoba) petr;
        System.out.println(pretypovano);

    }
}
