package org.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Creatingstreams {
    public void print() {
        System.out.println("Elements in Stream");
    }

    public static void main(String[] args) {
        //No ways to creating the stream : Stream.of()

        Stream<Integer> newStream = Stream.of(1, 2, 3, 4, 5);

        System.out.println("Elements in Stream using Stream.of() method");
        newStream.forEach(p->System.out.println(p));



        // creating stream from an array: Stream.of()

        Stream<Integer> arrayStream = Stream.of(new Integer[]{1,2,3,4,5});
        System.out.println("Array Elements in Stream using stream.of");

        arrayStream.forEach(p-> System.out.println(p));

        //Creating stream using List.stream()

        List<Integer> list  =new ArrayList<Integer>();
        for(int i=0;i<=10;i++)
        {
            list.add(i);
        }
        Stream<Integer> liststream = list.stream();
        System.out.println("List Elements in Stream using stream.of");
        liststream.forEach(p-> System.out.println(p));


    }

}
