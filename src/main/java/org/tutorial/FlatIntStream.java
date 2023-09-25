package org.tutorial;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class FlatIntStream {
 /*   IntStream flatMapToInt(Function<? super T,? extends IntStream> mapper)
    LongStream flatMapToLong(Function<? super T,? extends LongStream> mapper)
    DoubleStream flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)*/
    public static void main(String[] args) {
         List<List<Integer>> NumList = Arrays.asList( Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(4,5));

         int Totalsum = NumList.stream().flatMap(s->s.stream()).mapToInt(Integer::intValue).sum();

        System.out.println("TotalSum from NumList:"+Totalsum);




    }
}
