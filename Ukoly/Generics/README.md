# Lekce 12 - Úkol
Počet bodů: 25
Deadline: 19. 2. 2025
## Generika
- Ve všech úlohách používejte generiky všude kde to je možné.
1. Vytvořte program který vytvoří List a uloží do něj seznam studentů(String). 
    - Poté pomocí indexu odeberte studenta co už není v kurzu. Poté projděte seznam a oveřte zda opravdu daný student není v kurzu a výsledek vypište na obrazovku.
2. Vytvořte Třídu Student s parametry jmeno, prijmeni, rokNarozeni. Implementujte metody hashCode a equals. 
    - Následně vytvořte instance několika studentů a vložte je to množiny Set. Poté vytvořte nové instance už existujícíh studentů a ověřte zdali se nacházejí v dané množině. Výsledek vytiskněte na obrazovku.
3. Vytvořte třídu Tuple<E1,E2>, která bude mít dvě instanční proměnné jejíž typy jsou parametrizovány. Třída musí implementovat tyto metody: 
    - Konstruktor pro vytvoření třídy a předání obou prvků.
    - E1 getFirst()
    - E2 getSecond()
    - Překýt správně metody z hashCode a equals.
4. Třídu z úkolu 3 použíjte v Množině Set a dokažte správné fungování metod hasCode a equeal. Například pokusem o vložení duplicit, případně odebráním prvku z množiny. Vysledek vytiskněte na obrazovku.

*Bonus:* Zkuste zadaní vylepšit. Přemýšlejte co by se dalo udělat navíc a uveďte to v komentářích v kódu.
```java
//metody equals by měly používat k porovnání Objects.equals pro Ošetření null hodnot v metodě equals pomocí Objects.equals()
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return rokNarozeni == student.rokNarozeni &&
            Objects.equals(jmeno, student.jmeno) &&
            Objects.equals(prijmeni, student.prijmeni);
}
//Better solution 
@Override
public boolean equals(Object student) {
    if (this == student) return true;
    if (student == null || getClass() != student.getClass()) return false;
    Student other = (Student) student;
    return rokNarozeni == other.rokNarozeni 
           && jmeno.equals(other.jmeno) 
           && prijmeni.equals(other.prijmeni);
}
```

