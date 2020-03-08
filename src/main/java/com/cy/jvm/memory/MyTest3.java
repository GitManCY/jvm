package com.cy.jvm.memory;

//死锁 互相等待
public class MyTest3 {
    public static void main(String[] args) {
        new Thread(() -> A.method(), "Thread-A").start();
        new Thread(() -> B.method(), "Thread-B").start();
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class A {
    public static synchronized void method() {
        System.out.println("method A");
        try {
            Thread.sleep(5000);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B {
    public static synchronized void method() {
        System.out.println("method B");
        try {
            Thread.sleep(5000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}