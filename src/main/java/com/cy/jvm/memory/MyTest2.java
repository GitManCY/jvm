package com.cy.jvm.memory;

//虚拟机栈溢出
public class MyTest2 {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void test() {
        this.length++;
        test();
    }

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        try {
            myTest2.test();
        } catch (Throwable e) {
            System.out.println(myTest2.length);
            e.printStackTrace();
        }
    }
}
