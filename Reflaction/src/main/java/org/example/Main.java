package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Cat c= new Cat("jully",5);

        System.out.println(c.getAge());

        //print the al field are avalible in Cat class useing reflaction

        Field[] declaredFields = c.getClass().getDeclaredFields();
        for(Field f :declaredFields){
         System.out.println(f.getName());

            //change the final variable
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(c,"cat");
            }
        }
        System.out.println(c.getName());

        Method[] methods = c.getClass().getDeclaredMethods();

        for(Method m:methods){
        //  System.out.println(m.getName());
            if(m.getName().equals("printPrivateHello")){
                m.setAccessible(true);
                m.invoke(c);

            }
        }
    }
}