package com.cy.jvm.classLoader;

import sun.misc.Launcher;

public class MyTest12 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        System.out.println(ClassLoader.class.getClassLoader());
        //扩展类加载器和应用加载器都是由根加载器加载
        System.out.println(Launcher.class.getClassLoader());

        System.out.println(MyTest.class.getClassLoader());
    }
}
