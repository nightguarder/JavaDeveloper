package com.cyrils.java.ukoly;

import java.util.stream.Stream;

public abstract class NekonecnyStream {
    //use stream to generate unlimited numbers n%4 == 0
    public static Stream<Long> infiniteStream() {   
        return Stream.iterate(1l, x -> x + 1l);
    }
}
