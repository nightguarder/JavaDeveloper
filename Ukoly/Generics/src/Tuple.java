//Vytvořte třídu Tuple<E1,E2>, která bude mít dvě instanční proměnné jejíž typy jsou parametrizovány

import java.util.Objects;

class Tuple<E1, E2> {
    //dve proměnné 
    private E1 first;
    private E2 second;
    //konstruktor
    public Tuple(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    //gettters
    public E1 getFirst() {
        return first;
    }
    public E2 getSecond() {
        return second;
    }
    //metoda equals podobně jako v Student.java
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tuple<?, ?> other = (Tuple<?, ?>) obj;
        return first.equals(other.first) && second.equals(other.second);
    }
    //metoda hashCode podobně jako v Student.java
    @Override
    public int hashCode() {
        //alternativní použití Objects.hash
        return Objects.hash(first, second);
    }
}