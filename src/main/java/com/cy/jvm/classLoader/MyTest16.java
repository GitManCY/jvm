package com.cy.jvm.classLoader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class MyTest16 {

    public static void main(String[] args) {
        // Ext类加载器
//        Thread.currentThread().setContextClassLoader(MyTest.class.getClassLoader().getParent());

        ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = load.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver:"+driver.getClass()+"//loader:"+driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文加载器:"+Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器:"+ServiceLoader.class.getClassLoader());
    }
}
