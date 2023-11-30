package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Cat c = new Cat("swing",200);
        c.printAny();

        //check the class is having annotation
        if (c.getClass().isAnnotationPresent(MyAnnotation.class)) {
            System.out.println("class is containing annotation");
        } else {
            System.out.println("class not containing annotation");
        }

        //for method
     for(Method m :c.getClass().getDeclaredMethods()){
         if (m.isAnnotationPresent(MethodAnnotation.class)) {

             System.out.println("Method is having annotation");
             m.invoke(c);
         }
     }

     for(Field f:c.getClass().getDeclaredFields()){
         if (f.isAnnotationPresent(FieldsAnnotation.class)){
             System.out.println("Field having annotion");
             Object o = f.get(c);

             System.out.println(((String) o).toUpperCase());

         }
     }

    }
}