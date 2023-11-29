package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        IntegerToPrint toPrint=new IntegerToPrint(12);
        toPrint.printNumber();
//        IntegerToPrint toPrint=new IntegerToPrint("fafd");
//        IntegerToPrint toPrint=new IntegerToPrint(141.25); this will not allow to print

        Printer<Integer> printer=new Printer<>(12);//generics class
        printer.print();
        Printer<String> stringPrinter=new Printer<>("Ram");
        printer.print();
        //this can hold any type of value and print it

        List<Integer> listint=new ArrayList<>();
        listint.add(1);
        listint.add(2);

        List<String> lis=new ArrayList<>();
        lis.add("this is string");
        lis.add("another00");




        genericeMethod(12);



    }


    private  static <T>  void genericeMethod(T i){
        System.out.println(i + " doing something");

    }


    private  static void wildCardMethod(List<?> list){
        System.out.println();
    }
}