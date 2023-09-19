package org.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    Stream<Stream> streamEmpty = Stream.empty();

    public StreamAPI() {
    }

    public Stream streamOf(List<String> list) {
        return list != null && !list.isEmpty() ? list.stream() : Stream.empty();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sundar", "Sekar", "abinaya");
        list = null;
        StreamAPI streamAPI = new StreamAPI();
        Stream<String> listCheck = streamAPI.streamOf(list);
        System.out.println("Is Empty List:" + listCheck.collect(Collectors.toList()));
    }
}