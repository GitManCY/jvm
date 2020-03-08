package com.cy.jvm.classLoader;

public class MyTest9 {
    public static void main(String[] args) throws ClassNotFoundException {
        //ClassLoader来加载不是对类的主动使用
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> loadClass = systemClassLoader.loadClass("com.cy.jvm.classLoader.Cl");
        System.out.println(loadClass);
        System.out.println("----------------");
        //反射 对类的主动使用
        Class<?> name = Class.forName("com.cy.jvm.classLoader.Cl");
        System.out.println(name);
    }
}

class Cl {
    static {
        System.out.println("Class CL");
    }
}