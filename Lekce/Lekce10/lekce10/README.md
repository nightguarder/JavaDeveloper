# Lekce 10 - Polymorfismus a abstrakce
- Java umožňuje dědit pouze z jednoho rodiče.
    - Oproti Python, Ruby, C++ nemá java vícenásobnou dědičnost.
    - Vyjímkou je však rozhraní <Interface>
### Rozhraní - Interface**
- Rozhraní “Interface” je neco jako abstraktní třída, ale bez jakékoliv implementace.
    - Jedná se pouze o seznam metod které rozhraní obsahuje.
    - Třída která implementuje rozhraní, “zdědí” veškeré metody. 
    - Třída může implementovat jedno a více rozhraní 
    - Rozhraní je kompletně nezávisle na hierarchii dědění. *výhoda*

**What is an Interface?**
- Rozhraní nemůže definovat proměnné. *Pouze konstanty*
- [Baeldung](https://www.baeldung.com/java-interfaces) 
```java
    public interface Electronic {

    // Constant variable
    String LED = "LED";

    // Abstract method
    int getElectricityUse();

    // Static method
    static boolean isEnergyEfficient(String electtronicType) {
        if (electtronicType.equals(LED)) {
            return true;
        }
        return false;
    }

    //Default method
    default void printDescription() {
        System.out.println("Electronic Description");
    }
    //implements = zacleneni do tridy
    public class Lamp implements Electronic {
        //Je nutne implementovat metody z rozhrani
        
        public int getElectricityUse() {
            return 0;
        }
    }
}
```
**Proč Interface?**
- Future-proof 
- implementace více rozhraní - rozhraní je kompletně nezávisle na hierarchii dědění
    - interface Vozidlo --> interface Spotřeba --> class Auto
- Řeší kdo má přístup k metodám v rozhraní a kdo je implementuje