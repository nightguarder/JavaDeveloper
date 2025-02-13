## Lekce 7 - Úkol

**Vytvořte metody které na poli typu int[] :**
- Vrátí index nejmenšího a - největšího prvku. [Help](https://stackoverflow.com/questions/41380318/why-is-parallel-stream-slower)
    - [ArrayMinMax](src/ArrayMinMax.java)
- Vrátí součet, půměr, medián všech prvků pole. [Help](https://stackoverflow.com/questions/11955728/how-to-calculate-the-median-of-an-array)
    - [FindSumAvgMed](src/FindSumAvgMed.java)
- Vyhledá prvek v poli a vrátí jeho index. Pokud prvek není nalzen, vrátí -1. 
    - [FindKeyArray](src/FindKeyArray.java)

### Bonus
- Vytvořte alternativní implementaci metody na hledaní prvku pomoci binarního hledaní (Binary Search). Takzvané půlení intervalu. 
- Předpokládejte že pole je seřazené od nejmenšího do největšího prvku.
- [What is binary Seacrch](https://www.baeldung.com/java-binary-search)
______
- Program odevzdejte jako odkaz na GIT repozitář. Pro každý domací úkol používejte nový repozitář. Například pro ukol z lekce 7 odevzdejte v repozutari “úkol-7”.

### Pseudocode

```Java
//Find SumAvgMedian integers int array[]
//Nefunguje - median musí být double atd.
public static int[] findSumAverageMedian(int[] arr) {
        int sum = 0;
        int len = arr.length;
        
        for (int i = 0; i < len; i++) 
            sum += arr[i];
        
        int prumer = sum / len;
        int median = 0;

        if (len % 2 == 0) //delka pole je suda
            median = (arr[len / 2] + arr[len / 2 - 1]) / 2;
        else 
            median = arr[len / 2];
        
        return new int[] {sum, prumer, median};
    }
//Find max and min integer int array[]
int findMaxMin[int array[]]{
    //initialize var
    int len = array[].length;
    int max = array[0];
    int min = array[0];

    //loop through array
    for (int i = 1; i < len; i++){
        if (int array[i] > max)
            max = array[i] //update the max value
        if (int array[i]< min)
            min = array[i]
    }
    return (max, min);
```
### Bugs
```Java
Klic ke hledání: 99
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 100
        at BinarySearch.binarySearch(BinarySearch.java:23)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.binarySearch(BinarySearch.java:30)
        at BinarySearch.main(BinarySearch.java:48)
```
