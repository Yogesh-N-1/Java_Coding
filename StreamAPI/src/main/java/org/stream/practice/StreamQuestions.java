package org.stream.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {
//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

        List<Integer> num = List.of(1, 23, 42, 3, 121, 3, 4, 5, 1, 111, 4, 5, 6);
        List<Integer> collect = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

//        Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        Set<String> collect1 = num.stream().map(s -> s + "").filter(a -> a.startsWith("1")).collect(Collectors.toSet());
        System.out.println(collect1);

//        How to find duplicate elements in a given integers list in java using Stream functions?

        Set<Integer> uni = new HashSet<>();
        Set<Integer> collect2 = num.stream().filter(n -> !uni.add(n)).collect(Collectors.toSet());
        System.out.println(collect2);


//        Given the list of integers, find the first element of the list using Stream functions?


        List<Integer> n = List.of(1, 2, 3, 5, 5, 6, 6, 7, 7, 1, 2, 12, 31, 31, 31, 4, 3, 5);

        n.stream().findFirst().ifPresent(System.out::println);

//        Given a list of integers, find the total number of elements present in the list using Stream functions?
        long count = n.stream().count();
        System.out.println(count);


//        Given a list of integers, find the maximum value element present in it using Stream functions?
        n.stream().max((x, y) -> x.compareTo(y)).ifPresent(System.out::println);

//        Given a String, find the first non-repeated character in it using Stream functions?

//        Given a String, find the first non-repeated character in it using Stream functions?
        String s = "Hello this is my String";

        Character chr = s.chars().mapToObj(a -> Character.toLowerCase(Character.valueOf((char) a)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(b -> b.getValue() == 1L).map(f -> f.getKey())
                .findFirst().get();

        System.out.println("first non-repeated character : " + chr);


//        Given a String, find the first repeated character in it using Stream functions?

        Character c = s.chars().mapToObj(s1 -> Character.toLowerCase(Character.valueOf((char) s1)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() > 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();

        System.out.println("first repeated character : " + c);


//count the each charector in string
        Map<Character, Long> charCountMap = s.chars().mapToObj(m1 -> Character.toLowerCase(Character.valueOf((char) m1)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCountMap);


        String str1 = "This is String";
        char[] cr = str1.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : cr) {
            // Check if the character is already in the map
            if (map.containsKey(ch)) {
                // If yes, update the count
                map.put(ch, map.get(ch) + 1);
            } else {
                // If not, add the character to the map with count 1
                map.put(ch, 1);
            }

        }
        System.out.println(map);

    }
}
