# Lekce 10 - Polymorfismus
- Omezení dědičnosti v javě
- Polymorfismus umožňuje, aby objekty různých tříd reagovaly na stejný volaný příkaz (metodu) odlišným způsobem.
## Pravidla pro Polymorfismus
- Dva typy polymorfismu:
    1. **Přetížení metod (*overloading*):**
        - Stejné jméno metody s různým počtem nebo typem parametrů. Kompilátor vybere správnou metodu již při překladu.
    2. **Přepsání metod (*overriding*):**
        - Potomek třídy poskytuje vlastní implementaci metody, která je definovaná v rodiči. Při volání metody se provede verze z objektu aktuální třídy.
### Dynamický polymorfismus:
- Díky přepsání metod může být referenční proměnná typu rodiče použita k volání metod, které jsou přepsány v potomcích.
```java
Rodic obj = new Potomek();
obj.metoda(); // Volá metodu z třídy Potomek, pokud byla přepsána.
```