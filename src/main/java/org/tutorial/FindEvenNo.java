package org.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNo {
    public static void main(String[] args) {

        //Initiate the list
    /*    List<Integer> intList = new ArrayList<>();

        for(int i=0;i<=10;i++)
        {
            intList.add(i);
        }

        Stream<Integer> listStream = intList.stream();

       // intList = listStream.filter(i->i%2==0).collect(Collectors.toList());

        Integer[] evenArray = listStream.filter(i->i%2==0).toArray(Integer[]::new);
        System.out.println("Even Nos from List"+ Arrays.stream(evenArray).iterator());*/

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        //This two methods used for print array elements
        System.out.print(Arrays.toString(evenNumbersArr));
        System.out.print(Arrays.deepToString(evenNumbersArr));



    }



}
