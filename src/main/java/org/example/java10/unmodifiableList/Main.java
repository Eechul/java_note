package org.example.java10.unmodifiableList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Java 10! unmodifiable List!");

        List<String> origin = Arrays.asList("a", "b", "c");
//        origin.add("d"); // error!

        List<String> list = origin.stream().toList();
        //        List<String> list = origin.stream().collect(Collectors.toUnmodifiableList());
//        list.add("d"); // error!
    }
}
