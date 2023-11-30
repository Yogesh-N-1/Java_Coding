package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)//to make for class only
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
