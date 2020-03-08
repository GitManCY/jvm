package com.cy.jvm.byteCode;

/**
 * 栈桢(stask frame)
 * <p>
 * 栈桢是用于帮助虚拟机执行方法调用与方法执行的数据结构
 * <p>
 * 栈桢本身是一种数据结构 封装了方法的局部变量表、动态链接信息、方法的返回地址以及操作数栈等信息
 * <p>
 * 符号引用，直接引用
 *
 * 有些符号引用是在类加载阶段或者是第一次使用是就会转换成直接引用，这种转换叫做静态解析；
 * 另外一些符号则是在每次运行期转换为直接引用，这种转换叫做动态链接，这体现Java的多态性
 *
 * 1.invokeinterface:调用接口中的方法，实际上是在运行期来决定的，决定到底调用实现该接口的哪个对象的特定方法
 * 2.invokestatic:调用静态方法(解析阶段)
 * 3.invokespecial:调用自己的私有方法，构造方法<init> 以及父类的方法（解析阶段）
 * 4.invokevirtual:调用虚方法，运行期动态查找的过程
 * 5.invokedynamic:动态调用方法
 */

/**
 * 静态解析的方法的四种情景:
 * 1.静态方法
 * 2.父类方法
 * 3.构造方法
 * 4.私有方法
 * 他们都是（非虚方法）不能被重写 可以在类加载阶段可以将符号引用转换成直接引用的
 */

public class MyTest4 {

    public static void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        test();
    }
}
