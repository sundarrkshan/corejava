package org.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listMain = Arrays.asList(list1,list2,list3);

       // List<Integer> flatList= listMain.stream().flatMap(s->s.stream()).collect(Collectors.toList());

        List<Integer> flatList= listMain.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("Elements in Flat list::"+flatList);


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())  // Flattening step
                .collect(Collectors.toList());

        //Prints [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Flattened list: " + flattenedList);

        Integer[][] dataArray = new Integer[][] {{1,2},{3,4},{5,6},{7,8}};

        List<Integer> listInteger = Arrays.stream(dataArray).flatMap(s->Arrays.stream(s)).collect(Collectors.toList());

        System.out.println("Flattened Array:"+listInteger);

    }
}
