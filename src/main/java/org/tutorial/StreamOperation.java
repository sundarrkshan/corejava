package org.tutorial;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<String>();
        employees.add("Sehwag");
        employees.add("Vinoth");
        employees.add("Virat");
        employees.add("Gambhir");
        employees.add("Dhoni");
        employees.add("Rohit");
//Stream Intermediate operation
        //1.1 Stream.filter()

     //   employees.stream().filter(s->s.startsWith("V")).forEach(System.out::println);

       //1.2 stream.map() converts one object type to another type

     //   employees.stream().filter(s->s.startsWith("V")).map(s->s.toUpperCase()).forEach(System.out::println);
       //1.3 Stream.sorted()- to sort the elements naturally

    //    employees.stream().sorted().map(s -> (s.toUpperCase())).forEach(System.out::println);

//Stream Terminate Operation
        //2.1 Stream.forEach() used to print the elemnts in the stream

        //2.2 Stream.collect() used to store the stream elements into collection data.

      //  employees.stream().filter(s->s.contains("i")).collect(Collectors.toList()).forEach(System.out::println);

        //2.3 Stream.Match() used to match the predicate conditions and returns boolean result

        boolean isEmployeeZ = employees.stream().anyMatch(s->s.contains("z"));

        boolean isEmployeeA = employees.stream().anyMatch(s->s.contains("a"));

        System.out.println("Is Employee with 'Z' :"+isEmployeeZ);

        System.out.println("Is Employee with 'A' :"+isEmployeeA);

        boolean AllEmployeeE = employees.stream().allMatch(s->s.contains("e"));

        System.out.println(" Is All Empoyee With E:"+AllEmployeeE);

        boolean noneMatch  =employees.stream().noneMatch(s->s.contains("VI"));

        System.out.println("Is None of the employese with Vi:"+noneMatch);


     // 2.4 Stream.Count() is used to find the total no elements matched with condition and its result value in long data type.

        long totalIexist = employees.stream().filter(s->s.contains("i")).count();
        System.out.println(" Total No of I elements in the employee list:"+totalIexist);

     // 2.5 stream.reduce() used to reduce the elements (Concatening elements)

        Optional<String> reducedString = employees.stream().reduce((s1,s2)-> s1+'$'+s2);

        reducedString.ifPresent(System.out::println);

        // 3 Short circuit Operations

        //3.1 Stream.anyMatch() used to find the atleast one match with condition

            //3.2 Stream.findFirst() used to find the first elements within the condition and then its does not prccess anymore

        String firstVname=employees.stream().filter(s->s.startsWith("V")).findFirst().toString();

        System.out.println("Employee with first Vname:"+firstVname );












    }

}
