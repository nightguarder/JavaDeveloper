# Lekce 16 - Úkol
Počet bodů: 20
Deadline: 17 února 2025
## Funktionální rozhraní
- Rozhraní, které obsahuje pouze jednu abstraktní metodu ale, může obsahovat více defaultních metod. 
- označeno anotací ``@java.lang.FunctionalInterface``
- Po splnění těchto podmínek, můžeme instance tohoto rozhraní vytvářet jako lambda výrazy.
---
## Ukoly:
1. Vytvořte třídu Osoba, s instančními proměnnými Jméno a věk. Poté vytvořte kolekci s
několika instancemi a vyfiltrujte osoby starší 25 let. 
    - Výsledek uložte do List&lt;Osoba&gt;.
    - Použíjte metodu .collect
2. Vytvořte funkcionální rozhraní ``MatematickaOperace`` s metodou ``apply(int a, int b)``. 
- Pote vytvořte pomocí lambda výrazů operace sčítání, odčítání a násobení. 
- Pomocí anonymní vnitřní třídy operaci dělení. V operaci dělení ošetřete neplatné vstupní hodnoty pomocí
výjimek. Demonstrujte použití všech operací, včetně výjimek.
- Z nekonečného streamu(viz níže), vyfiltrujte prvních 100 čísel dělitelných 4 a ty poté:
    - Sečtěte, ekvivalent matematické operace Σ
    - Vynásobte. Ekvivalent matematické operace ∏
    - Při násobení upravte vhodně první element tak abyste dostali výsledek.

- K provedení tohoto úkolu definujte dvě lambdy a použijte metodu reduce.
Demonstrujte použití na příkladu.

- Všechna cvičení odevzdávejte v jednom repozitáři na GitHubu. Dodržujte konvence
pojmenování tříd, proměnných a balíků v Javě.
- Metoda kterou můžete použít ke generování nekonečného stremu:
```java
public static Stream<Long> nekonecnyStrem() {
   return Stream.iterate(1l, x -> x + 1l);
}

```