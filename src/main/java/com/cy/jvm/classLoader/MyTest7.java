package com.cy.jvm.classLoader;

import java.util.Random;

public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(FT.x);
    }
}

class FT {
//    public static final int x = new Random().nextInt(10);
    public static final int x = 3;

    static {
        System.out.println("xxx");
    }
}