import java.util.HashSet;
import java.util.Set;

public class AbstractSet {
    static class Auto {
        String znacka;

        public Auto(String znacka) {
            this.znacka = znacka;
        }
        String getZnacka() {
            return znacka;
        }
        void setZnacka(String znacka) {
            this.znacka = znacka;
        }

        /* Metody tridy Auto */
        /* equals a hashCode lze vygenerovat automaticky */
        @Override
        public String toString() {
            return "Auto {" + "znacka = \"" + znacka  + '\'' + "}";
        }
        @Override
        public boolean equals(Object obj) { // Pomoci metody equals se porovnava obsah objektu
            Auto cizi = (Auto) obj;
            return znacka.equals(cizi.znacka);
        }
        //Equals a hashCode musi byt vzdy spolu
        
        @Override               //Urychleni vyhledavani protoze se porovnava jen hashCode
        public int hashCode() { //Pomoci metody hashCode se porovnava reference objektu
            //hashCode = Predtřídění setu 
            return znacka.hashCode(); //vratime kontrolní součet znacky
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Mnozina nesmi mít duplicitní prvky
        Set mnozina = new HashSet();

        mnozina.add("První");
        mnozina.add("Druhý");
        mnozina.add("První"); //Duplicitní prvek

        System.out.println(mnozina); //Vypíše vsechny prvky bez duplicitních

        mnozina.remove("První"); //Odebrani

        System.out.println(mnozina); //Druhy prvek zustal


        /* Operace s mnozinami */
        //HashSet je nejrychlejsi
        //Nikdy nevime v jakem poradi se prvky vypisi
        //Nemaji indexy
        //Nemaji duplicitni prvky
        //Serazení prvků je náhodné
        //TODO: Lze pretypovat na List
        Set Auta = new HashSet();

        Auto a = new Auto("Fiat");
        Auta.add(a);
        Auta.add(new Auto("Fiat"));
        
        Auta.add(new Auto("Škoda"));
        Auta.add(new Auto("Opel"));
        Auta.add(new Auto("Opel")); //Dve instance objektu vytvorene na stejnem miste Heapu
        //Pokud pridany prvek jiz existuje a pozdeji ho zmenime, bude se zobrazovat jen posledni zmena
        //TODO: Zmena znacky setter
        //zmenime Fiat na Ford
        //**POZOR: Porovnání probíhá pomocí metody equals nemusí fungovat správně
        a.setZnacka("Ford");
        System.out.println(Auta);
    }
    
}
