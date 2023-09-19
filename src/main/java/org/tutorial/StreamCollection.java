package org.tutorial;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamCollection {
    public StreamCollection() {
    }

    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("a", "b", "c");
        Stream<String> collectionStream = list.stream();
        Stream<String> streamofarray = Stream.of("a", "b", "c");
        String[] array = new String[]{"a", "b", "c"};
        String[] var10000 = new String[]{"Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda"};
        var10000 = new String[]{"a", "b", "c"};
        Stream<Serializable> arrString = Arrays.stream(array, 1, 3);
        System.out.println("Is Empty List:" + arrString.toArray());
    }
}