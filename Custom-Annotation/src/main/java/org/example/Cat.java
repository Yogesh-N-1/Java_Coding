package org.example;

@MyAnnotation
public class Cat {

    @FieldsAnnotation
    String name;

    int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printAny() {
        System.out.println("Hello I am any method");
    }


    @MethodAnnotation //this is only from method
    public void printHow() {
        System.out.println("Hello I am in how method");
    }


}
