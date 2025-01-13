# Lekce 11 - Kolekce v Javě

- Datové struktury pro ukládání objektů
- **použití**:
    - List (LinkedList(), ArrayList())
    - Set (HashSet(),TreeSet())
    - Map (HashMap(),TreeMap())

## Kolekce 
- diagram pro přehled dědičnosti a iterace nad objekty

![Diagram](/Notes/Kolekce-list_map_set.png)

### Seznam
- [Pouziti ArrayLiustu](/Lekce/Lekce11/Collection/src/Kolekce.java)

### Pretypování Objektu
- [Pouziti Pretypovani](/Lekce/Lekce11/Collection/src/Pretypovani.java)
### Map
- HashMap = klič + hodnota
- [ ] DÚ: ``//TODO: Vlastni trida ktera reporezentuje objeck klic a implementovat metody equals a hashCode``
- [Pouziti metod prohledavani v HashMap](/Lekce/Lekce11/Collection/src/MyMap.java)
### Iterable *Iterátor*
- Supertřída nad všemi pod nimi - viz. diagram
- **Iterator**
 - Datová struktura na procházení/iterování jakékoliv množiny
    - boolean hasNext() - Vrací true pokud mé minimálně jeden další prvek
    - Object next() - Vrací další prvek a posouvá ukazatel na další prvek.
    - *Note: Před dalším voláním je potřeba ověřit zdali existuje další prvek.*

- **Iterable**
    - Iterator iterator() - vrací iterátor.
    - Každá třída implementující Iterable může být použita ve for-each na procházení prvků

- [ ] DÚ: 
- [Pouziti Iterable](/Lekce/Lekce11/Collection/src/Iterable.java)
## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
