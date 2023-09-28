package org.tutorial;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimitElemnts {
    public static void main(String[] args) {
        Stream<Integer> IntStream = Stream.iterate(0,n->n+2);

        List<Integer> listOf10 = IntStream.filter(s->s%2==0).limit(10).collect(Collectors.toList());

        System.out.println("First 10 elemnts in the List"+listOf10);
/*
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);*/
    }
}
