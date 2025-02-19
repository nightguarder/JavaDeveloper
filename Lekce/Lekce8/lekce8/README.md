# Lekce 8 - OOP
- Objekty, Konstruktory, This, Getters, Setters, statické vs instanční metody

## Tridy a jejich vlastnosti

**Konstruktory:**
- Při vytváření objektů potřebujeme udělat na začátku inicializaci instančních proměnných.
- Zkontrolovat zda zadané hodnoty jsou platné
- Případně vytvořit další objekty které jsou součástí dané třídy
*Note:*
- Každá třída musí mít alespoň **jeden** konstruktor
    - Pokud nemá, překladač vytvoří **defaultní/výchozí** bezparametrický konstruktor.
- Konstruktorem je metoda jejíž jméno je stejné jako jméno třídy.
    - Nevrací žádnou hodnotu, ani void. 
    ```java
    public class Zarovka 
    ...
        public Zarovka(); 
        ...
    ```

**This**
- Slouží pro přístup k instančním proměnným.
- Výhodné pokud parametry metody/konstruktoru mají stejný název jako instanční proměnné.
- Velmi častý “návrhový vzor”

**Getters/Setters**
- Není dobré dávat cizím lidem přímý přístup k instančním proměnným
- V javě používáme na toto zaběhlou konvenci: 

    1. Pro získání dat:   setNazevProměnne
    2. Pro datovy typ boolean isNazevPromenne.
    3. Pro nastavení setNazevProměnne

- Takovým objektům se pak říká Java [Beans](https://cs.wikipedia.org/wiki/JavaBeans)

**Statické vs Instanční metody**
- Statická metoda patří k samotné třídě 
- instanční metoda patří k jednotlivým objektům
```java
public class Example {
    // Instanční proměnná
    private int counter;

    // Instanční metoda - pracuje s proměnnou 'counter'
    public void increment() {
        counter++;
    }

    // Staticka metoda - nelze s ní přímo pracovat
    public static void helloWorld(){
        System.out.println("HelloWorld.")
    }
```
- Takto se často implementují také gettery a settery u JavaBeans, kdy se staráme o bezpečný přístup k soukromým (private) instančním proměnným.

```java
public class Konstruktor {
    boolean status;

    // Default constructor
    public Konstruktor() {
        status = true;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        //this
        //slouzi pro pristup k instanci proměnných
        this.status = status;
    }
    // Constructor s parametry
    public Konstruktor(boolean defaultState) {
        status = defaultState;
    }
```