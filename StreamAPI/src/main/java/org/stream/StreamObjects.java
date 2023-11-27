package org.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {

    //how to create stream object

    public static void main(String[] args) {
        //this will create empty Stream
        //way 1
        Stream<Object> empty = Stream.empty();


        String name[] = {"yoge", "How", "no", "Yns"};


        //way 2
        Stream<String> st = Stream.of(name);

        st.forEach(i -> {
            System.out.println(i);
        });


//way 3
        Stream<Object> build = Stream.builder().build();


        //4 using array and  anonymous array

        IntStream stream = Arrays.stream(new int[]{1, 3, 34, 45, 5, 56, 6, 23, 2, 2});
        stream.forEach(d -> {
            System.out.println(d);
        });


        //way 5

        List<String> nlist= new ArrayList<>();

        nlist.add("helle");
        nlist.add("ye");
        nlist.add("fd");
        nlist.add("heladale");

        nlist.stream().forEach(f->{System.out.print(f);});



    }


}
