# Lekce 9 - Dědičnost v Javě
- Dědění je jeden ze základních principů objektově orientovaného programování (OOP).
- Umožňuje jedné třídě (potomkovi) zdědit vlastnosti a metody jiné třídy (rodiče).
    - 
- Podporuje znovupoužitelnost kódu a usnadňuje jeho rozšíření.
    - *Znovupoužitelnost*: Kód rodičovské třídy lze využít ve zděděných třídách.
- V Javě se dědění implementuje pomocí klíčového slova **extends**.
    -  ``class PotomekTrida extends RodicTrida {}``   

**Polymorfismus:** 
- Dědění umožňuje použití polymorfismu k přetížení nebo přepsání metod.
- viz. dále [lekce10]()

## Vyhody / Nevyhody
- Java umožňuje dědit pouze z jednoho rodiče.
    - Oproti Python, Ruby, C++ nemá java vícenásobnou dědičnost.

## Override - Překrývání
**Usecase:**
 - Potomek může přepsat metody rodiče, aby upravil jejich chování.
 - Překrytá metoda musí mít stejný *název,* *návratový typ*, *parametry*.
 ```java
 class Animal{
    public void sayHello(String name){
        println("Say hello " + name);
    }
 }
 class Dog{
    public void sayHello(String name){
        println("Say Goodbye " + name)
    }
 }

 ```

## Abstraktní třída
- Neumožnuje vytvářet instance
- Slouží jako typ pro reference.
- Označena kličovým slovem abstract.
- Může obsahovat abstraktní metody
     Vsichni kdo dědí z dané třídy *abstract* musí implementovat abstraktní metody
- [AbstractClass](/src/AbstractClass.java)

## Supertřída - Java.lang.Object
- Všechny třídy v Javě implicitně dědí z java.lang.Object.
- java.lang.Object poskytuje základní metody, které mohou být přepsány nebo využity.
- **např.** 
    - toString()
    - equals(Object obj)
    - hashCode()
    - getClass() - *vrací instanci ktera popisuje informace tridy*
- Metody které se nedoporučuje používat:
    - clone(): Vytváří a vrací kopii objektu (vyžaduje implementaci Cloneable)
    - finalize(): Metoda volaná před zničením objektu (není doporučeno spoléhat na tuto metodu). Máme daleko lepší metody pro správu paměti


## Opakovani 
- Co je to *konstruktor*? a klicove slovo *this*? *Getters*? *Setters*?
- [Lekce8](../../Lekce8/lekce8/README.md)

## Ukol - dobrovolný
- Naimplementuj třídu Animal a její potomky s metodami dle schéma
- [Animal.java](src/Animal.java)
![Dedicnost schema](/Inheritance_scheme.png)
*Note:* Toto je pouze malý příklad, představ si spíše větší projekt - škálovatelnost
