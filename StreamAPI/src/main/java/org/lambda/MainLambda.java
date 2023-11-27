package org.lambda;

public class MainLambda {
    public static void main(String[] args) {

        //way three to use Functional Interface
        FunInterface lamb = () -> System.out.println("this is lambda use functional interface method");
        lamb.hello();

        SumInterface sum = (a, b) -> {
            return a + b;
        };
//        SumInterface sum=(a,b)->a+b;   this is one one
//        SumInterface sum= Integer::sum; //this is method refrence way we can do that way also
        System.out.println(sum.sum(2, 5));
        System.out.println(sum.sum(2, 10));
//        FunInterface lamb= () -> {
//            System.out.println("this is lambda use functional interface method");
//        };


//useing lengInterface to get lenght of the string

        LenInterface len = (s) -> s.length();
        System.out.println("this is length :" + len.getLenght("THis is length"));

//        LenInterface h= String::length;

        //way one
        FunInterfaceImpl fn = new FunInterfaceImpl();
        fn.hello();

        //way two anonymous class
        FunInterface an = new FunInterface() {
            @Override
            public void hello() {
                System.out.println("this is anonymous class");
            }
        };

        an.hello();
    }


}
