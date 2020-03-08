package com.cy.jvm.classLoader;

public class MyTest6 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());
        Class<?> clazz_c = Class.forName("com.cy.jvm.classLoader.C");
        System.out.println(clazz_c.getClassLoader());

    }
}

class C {

}