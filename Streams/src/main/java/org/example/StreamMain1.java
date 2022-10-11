package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMain1 {
    public static void main(String[] args) {
        // TODO Auto: create a list and filter all even numbers.
        // create a list of random numbers
        List<Integer> list = List.of(23, 56, 2, 87, 88, 56, 43);

        /* then filter-out the even numbers with the help of stream and call filterMETHOD add condition in
             to get even numbers then collect the even numbers in list and call print method.
        */
        List<Integer> newList = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        // to get numbers greater than 50.
        List<Integer> newList2 = list.stream().filter(integer -> integer > 50).collect(Collectors.toList());
        System.out.println(newList2);


    }
}