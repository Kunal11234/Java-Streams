package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Create a new array
        String[] name = {"qA80Lp", "GPS", "8H8L", "8tFx", "4Z3LIdQ"};
        // use this name array in stream.
        Stream<String> stringStream = Stream.of(name);
        // then print using stream function
        stringStream.forEach(e -> System.out.print(e + ","));

        System.out.println();


        // create a new array in stream
        IntStream stream = Arrays.stream(new int[]{23, 5, 43, 5, 6, 43, 43, 22});
        //then print using stream function
        stream.forEach(e -> System.out.print(e + ","));


        System.out.println();

        //using stream with list object
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(45);
        integerList.add(67);
        integerList.add(90);
        integerList.add(5);
        integerList.add(4);

        Stream<Integer> stream1 = integerList.stream();
        stream1.forEach(integer -> System.out.print(integer +","));


    }
}
