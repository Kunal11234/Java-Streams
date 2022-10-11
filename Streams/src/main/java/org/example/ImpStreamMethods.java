package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ImpStreamMethods {
    public static void main(String[] args) {
        //filter (predicate -> means boolean value function returns T/F)
        List<String> list = List.of("Kunal", "vinay", "karate", "Vipulse");
        List<String> newNames = list.stream().filter(i -> i.startsWith("V")).collect(Collectors.toList());
        System.out.println(newNames);


        //map (operation on all elements in list and returns that elements)
        List<Integer> integerList = List.of(1, 45, 3, 2, 3, 4);
        List<Integer> collect = integerList.stream().map(integer -> integer * integer).collect(Collectors.toList());
        System.out.println(collect);

        //to sort the list
        integerList.stream().sorted().forEach(System.out::print);

        // to find min in list with help of stream min function
        Integer integer = integerList.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(integer);


        // to find max in list with help of stream max function
        Integer integer2 = integerList.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(integer2);

    }
}
