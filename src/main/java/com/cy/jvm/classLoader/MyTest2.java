package com.cy.jvm.classLoader;

import java.util.UUID;

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str2);
    }
}
class MyParent2 {
//    public static final String str = "str";
    //这个UUID.randomUUID().toString()编译期间不知道str2的值（不是编译器常量）
    public static final String str2 = UUID.randomUUID().toString();

//    public static final short s =127;
//    public static final int i = 128;
//    public static final int m = 1;

    static {
        System.out.println("MyParent");
    }
}