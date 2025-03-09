<<<<<<< HEAD
# Lekce 10 - Úkol
- Počet bodů: 25

# Správa letiště
- Úkol: Vytvořte program v jazyce Java pro správu letiště. Tento program bude obsahovat následující koncepty:
### Rozhraní:
- Vytvořte rozhraní *Flight*, které bude reprezentovat lety na letišti. Toto rozhraní by mělo obsahovat metody:

- String getFlightNumber(): Vrátí číslo letu.
- String getDestination(): Vrátí cílové místo letu.
- int getPassengerCount(): Vrátí počet cestujících na letu.

### Abstraktní třída:
- Vytvořte abstraktní třídu *AbstractAircraftFlight*, která bude implementovat rozhraní *Flight*. Tato třída bude obsahovat atributy pro číslo letadla a aktuální počet cestujících na palubě. Implementujte metody z rozhraní.

### Konkrétní třídy:
- Vytvořte několik konkrétních tříd, které dědí od AbstractAircraft
- *PassengerPlaneFlight*: Tato třída bude reprezentovat osobní letadlo. Může obsahovat atributy jako počet sedadel a třídu letu (první třída, ekonomická třída).
- *CargoPlaneFlight*: Tato třída bude reprezentovat nákladní letadlo. Může obsahovat atributy jako maximální váha nákladu a typ nákladu (např. zboží, potraviny).

### Polymorfismus:
- Vytvořte seznam letů a proveďte několik operací, jako je zjišťování počtu cestujících na daném letu, výpis informací o letech. Pro uložení seznamu letů, můžete použít pole.  - Pokud budete program zpracovávat po lekci 11, můžete využít znalosti a konstrukce z lekce 11. 

### Hlavní program:
=======
## Lekce 10 - Úkol
__Název úkolu: Správa letiště__

- Vytvořte program v jazyce Java pro správu letiště. Tento program bude obsahovat následující koncepty:

## Rozhraní:
- Vytvořte rozhraní Flight, které bude reprezentovat lety na letišti. 
- Toto rozhraní by mělo obsahovat metody:

    - String getFlightNumber(): Vrátí číslo letu.
    - String getDestination(): Vrátí cílové místo letu.
    - int getPassengerCount(): Vrátí počet cestujících na letu.

## Abstraktní třída:
- Vytvořte abstraktní třídu AbstractAircraftFlight, která bude implementovat rozhraní Flight. 
- Tato třída bude obsahovat atributy pro číslo letadla a aktuální počet cestujících na palubě. Implementujte metody z rozhraní.

## Konkrétní třídy:
- Vytvořte několik konkrétních tříd, které dědí od AbstractAircraft
    - PassengerPlaneFlight: Tato třída bude reprezentovat osobní letadlo. Může obsahovat atributy jako počet sedadel a třídu letu (první třída, ekonomická třída).
    - CargoPlaneFlight: Tato třída bude reprezentovat nákladní letadlo. Může obsahovat atributy jako maximální váha nákladu a typ nákladu (např. zboží, potraviny).

## Polymorfismus:
- Vytvořte seznam letů a proveďte několik operací, jako je zjišťování počtu cestujících na daném letu, výpis informací o letech. Pro uložení seznamu letů, můžete použít pole. Pokud budete program zpracovávat po lekci 11, můžete využít znalosti a konstrukce z lekce 11. 

## Hlavní program:
>>>>>>> 24e9eb3 (Lekce 10 done)
- Vytvořte hlavní program, který výtvoří instance tříd, a demonstruje možnosti vytvořených tříd a výhody polymorfismu.
