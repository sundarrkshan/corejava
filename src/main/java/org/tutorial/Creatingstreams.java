package org.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creatingstreams {
    public void print() {
        System.out.println("Elements in Stream");
    }

    public static void main(String[] args) {
        //No ways to creating the stream : Stream.of()

        Stream<Integer> newStream = Stream.of(1, 2, 3, 4, 5);

        System.out.println("Elements in Stream using Stream.of() method");
        newStream.forEach(p -> System.out.println(p));


        // creating stream from an array: Stream.of()

        Stream<Integer> arrayStream = Stream.of(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Array Elements in Stream using stream.of");

        arrayStream.forEach(p -> System.out.println(p));

        //Creating stream using List.stream()

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        Stream<Integer> liststream = list.stream();
        System.out.println("List Elements in Stream using stream.of");
        liststream.forEach(p -> System.out.println(p));

        //generating Stream using the stream.generate or iterate()

        Stream<Integer> generateStream = Stream.generate(() -> (new Random()).nextInt(100));
        System.out.println("Random elements using Stream.generate:");
        //    generateStream.limit(20).forEach(System.out::println);
        generateStream.limit(20).forEach(p -> System.out.println(p));

        //Create stream from string characters

        IntStream charStream = "1234DSFGg".chars();
        System.out.println("Chars from string using String.char():");
        charStream.forEach(System.out::println);

        //Create stream from a string by split() fpr mremoving the token

        Stream string = Stream.of("gdhdjksa@#$".split("\\$"));
        string.forEach(p -> System.out.println(p));


    }

}
