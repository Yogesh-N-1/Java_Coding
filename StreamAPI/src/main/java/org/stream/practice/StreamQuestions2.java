package org.stream.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions2 {
    public static void main(String[] args) {
// How to count each element/word from the String ArrayList in Java8?

        List<String> word=List.of("EE","BB","CC","EE","RR","AA");
        LinkedHashMap<String, Long> collect1 = word.stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1);

//        Java 8 program to perform cube on list elements and filter numbers greater than 50.

        List<Integer> intnum= List.of(1,4,5,6,23,5,6,7,7,10,34,4,33);

        List<Integer> list2 = intnum.stream().map(n -> n * n * n).filter(v -> v > 50).toList();
        System.out.println(list2);

//        How to use map to convert object into Uppercase in Java 8?
        List<String> obj= List.of("My","Name","is");
        List<String> list3 = obj.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(list3);


//        Write a Java 8 program to concatenate two Streams?

         List<String> arr1= List.of("My","Name","is");
         List<String> arr2= List.of("Yog","and","Nothing");
        List<String> list1 = Stream.concat(arr1.stream(), arr2.stream()).toList();

        System.out.println(list1);


//        Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> num = List.of(1, 3, 24, 5, 7, 1, 3, 323, 33, 5, 532, 566);

        List<Integer> collect = num.stream().sorted().collect(Collectors.toList());
        System.out.println("Sort Array in Ascending oder : " + collect);

//        List<Integer> list = num.stream().sorted((x,y)->y.compareTo(x)).toList();
        List<Integer> list = num.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println("Sort Array in Descending oder : " + list);

        System.out.println("Second Largest Number in Integers Array : " + num.get(num.size() - 2));

        //Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.

        System.out.println("Contains Dublicate : " + isDublicate(new int[]{1, 2, 3, 4, 5, 5, 5, 6}));

    }

    //value appears at least twice in the array,
    public static boolean isDublicate(int[] n){
        List<Integer> collect1 = Arrays.stream(n).boxed().toList();

        Set<Integer> ele = new HashSet<>(collect1);
        if (collect1.size() == ele.size()) {
            return false;
        }
        return true;
    }
}
