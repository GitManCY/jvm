package com.cy.jvm.classLoader;


public class MyTest4 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    int a = 6;
}

interface MyChild5 extends MyParent5{
    int b = 5;
}