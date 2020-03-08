package com.cy.jvm.classLoader;

public class MyTest14 extends Thread {

    private Thread thread;

    public MyTest14() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader contextClassLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(contextClassLoader);

        System.out.println("Class:" + contextClassLoader.getClass());
        System.out.println("Class:" + contextClassLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest14();
    }
}
