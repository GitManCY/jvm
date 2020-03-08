package com.cy.jvm.gc;

public class MyTest3 {

    public static void main(String[] args) {


        Integer integer1 =  127;
        Integer integer2 = 127;

        Integer integer3 =  128;
        Integer integer4 = 128;



        System.out.println(integer1 == integer2);
        System.out.println(integer3 == integer4);
    }
}
