package com.cy.jvm.classLoader;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest11 {

    public static void main(String[] args) throws IOException {
        String[] strings = new String[3];
        System.out.println(strings.getClass().getClassLoader());

        MyTest[] myTests = new MyTest[3];
        System.out.println(myTests.getClass().getClassLoader());

        Integer[] ints = new Integer[3];
        System.out.println(ints.getClass().getClassLoader());
    }
}
