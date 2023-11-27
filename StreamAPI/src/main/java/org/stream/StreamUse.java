package org.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StreamUse {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 34, 4, 5, 6, 67, 56, 3, 3,11 );

        //without stream api
        //get list of even numbeers
        ArrayList<Integer> evenList = new ArrayList<>();
        for(Integer i : list)
        {
            if(i%2==0){
                evenList.add(i);
            }
        }
        System.out.println(evenList);

        //with Stream API

        List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        

        //find the number greater that 50
        List<Integer> collect1 = list.stream().filter(i -> i >= 50).collect(Collectors.toList());
        System.out.println(collect1);


    }

}