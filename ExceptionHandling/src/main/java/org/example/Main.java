package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

       Exception1 ex= null;
//        System.out.println(ex.name);

        try {
            System.out.println(ex.name);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally get executed");
        }
    }
}