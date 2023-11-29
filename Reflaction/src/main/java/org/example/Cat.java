package org.example;

public class Cat {


    private final String name;

    int age=3;

    public void printHello(){

        System.out.println("hello");

    }
    private void printPrivateHello(){
        System.out.println("hello from private method");
    }

    public static void printStaticHello(){
        System.out.println("Hello from static");
    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
