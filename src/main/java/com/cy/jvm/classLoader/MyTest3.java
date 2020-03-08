package com.cy.jvm.classLoader;

import java.util.UUID;

public class MyTest3 {
    public static void main(String[] args) {
        MyParent4[] s = new MyParent4[1];
        System.out.println(s.getClass());
        int[] ints = new int[1];
        System.out.println(ints.getClass());
    }
}
class MyParent4 {

    static {
        System.out.println("MyParent");
    }
}
