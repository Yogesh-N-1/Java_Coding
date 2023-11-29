package org.stream.practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQuestions3 {
    public static void main(String[] args) {

        // Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> num=List.of(1,2,3,4,56,77,12,23,13,1,13,4,56,67,78,10);

        List<Integer> collect = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("even numbers exist in the list ");
        System.out.println( collect);


        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> list = num.stream().map(s -> s + "").filter(n -> n.startsWith("1")).map(i -> Integer.parseInt(i)).toList();
        System.out.println(list);

       // How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> s= new HashSet<>();
        List<Integer> list1 = num.stream().filter(m -> !s.add(m)).toList();
        System.out.println("Find duplicate elements in a given integers list in java using Stream functions");
        System.out.println(list1);


        //Given the list of integers, find the first element of the list using Stream functions?
        num.stream().findFirst().ifPresent(System.out::println);


        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        long count = num.stream().count();
        System.out.println("Find the total number of elements present in the list using Stream functions?");
        System.out.println(count);

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        num.stream().max((a,b)->a.compareTo(b)).ifPresent(System.out::println);

//        Given a String, find the first non-repeated character in it using Stream functions?

        String str="this is string";
        Character c1 = str.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(en -> en.getValue() == 1L)
                .map(ky -> ky.getKey())
                .findFirst()
                .get();
        System.out.println(c1);


        //Given a String, find the first repeated character in it using Stream functions
        Character c2 = str.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1L)
                .map(c -> c.getKey())
                .findFirst()
                .get();
        System.out.println(c2);
    }
}
