package org.stream.practice;

import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestions3 {
    public static void main(String[] args) {

        // Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> num=List.of(1,2,3,4,56,77,12,23,13,4,56,67,78,10);

        List<Integer> collect = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("even numbers exist in the list ");
        System.out.println( collect);
//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

        List<Integer> list = num.stream().map(s -> s + "").filter(n -> n.startsWith("1")).map(i -> Integer.parseInt(i)).toList();
        System.out.println(list);
    }
}
