package com.cy.jvm.memory;

import java.util.ArrayList;
import java.util.List;


//堆内存溢出
public class MyTest1 {

    public static void main(String[] args) {
         List<MyTest1> list = new ArrayList<>();
         for (;;){
             list.add(new MyTest1());
//             System.gc();
         }
    }
}
