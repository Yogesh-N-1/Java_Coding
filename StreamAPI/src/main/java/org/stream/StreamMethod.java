package org.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

    public static void main(String[] args) {

        //parallel stream,
        List<String> l= List.of("Yogesh", "YO","Ma","hello","no","this");

        List<String> collect2 = l.stream().parallel().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("parallel thread " + collect2);



        List<String> city = List.of("Pune", "Mumbai", "Deli", "Poa");

        List<String> p = city.stream().filter(c -> c.startsWith("P")).collect(Collectors.toList());
        System.out.println(p);


        List<Integer> num = List.of(1, 2, 3, 4, 45, 35, 3, 2, 2, 2, 344);

        List<Integer> collect = num.stream().map(n -> n * n).filter(n -> n > 10).collect(Collectors.toList());
        System.out.println(collect);

        //we can print element using foreach method
        city.stream().forEach(e -> {
            System.out.println(e);
        });

        //insted of above  In Java, :: is known as the method reference operator.
        city.stream().forEach(System.out::println);


        //sorted() method use to sort number in accenting order
        List<Integer> collect1 = num.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);

        //min()

        Integer i = num.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min number is :" + i);
        //max()

        Integer i2=num.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max number is : " + i2);

    }
}
