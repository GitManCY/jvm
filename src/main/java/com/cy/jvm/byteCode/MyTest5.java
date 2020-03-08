package com.cy.jvm.byteCode;


public class MyTest5 {
    public void test(Grandpa g) {
        System.out.println("Grandpa");
    }
    public void test(Father f) {
        System.out.println("Father");
    }
    public void test(Son s) {
        System.out.println("Son");
    }
    public static void main(String[] args) {
        Grandpa grandpa1 = new Father();
        Grandpa grandpa2 = new Son();
        MyTest5 myTest5 = new MyTest5();
        myTest5.test(grandpa1);
        myTest5.test(grandpa2);
    }
}
class Grandpa {

}
class Father extends Grandpa {

}
class Son extends Father {

}
