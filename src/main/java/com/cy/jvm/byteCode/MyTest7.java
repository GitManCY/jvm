package com.cy.jvm.byteCode;

import java.util.Date;

public class MyTest7 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.test("");

        Animal dog = new Dog();
        dog.test(new Date());
    }
}

class Animal {
    public void test(String str) {
        System.out.println("animal test str");
    }

    public void test(Date date) {
        System.out.println("animal test date");
    }

}
class Dog extends Animal{

    @Override
    public void test(String str) {
        System.out.println("dog test str");
    }

    @Override
    public void test(Date date) {
        System.out.println("dog test date");
    }
}