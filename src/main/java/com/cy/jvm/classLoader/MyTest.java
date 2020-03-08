package com.cy.jvm.classLoader;

import java.util.Random;

public class MyTest {
    public static void main(String[] args) {
//        System.out.println(MyChild.str);
        System.out.println("---------------");
        System.out.println(MyChild.i);
    }

}

class MyParent {
    public static int i = new Random().nextInt(10);

    static {
        System.out.println("MyParent");
    }

}

class MyChild extends MyParent{
    public static String str2 = "str2";

    static {
        System.out.println("MyChild");
    }
}