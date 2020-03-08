package com.cy.jvm.byteCode;

/**
 * 方法的动态分派
 * 方法动态分派涉及到一个重要概念：方法接受者
 *
 * invokevirtual字节码指令的多态查找流程
 * 比较方法重载和方法重写 可以得出结论:方法重载是静态的，是编译期行为；
 *                                方法重写是动态的，是运行期行为；
 *                                方法的调用者不同(鲜明不同)
 */
public class MyTest6 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();

    }
}

class Fruit {
    public void test() {
        System.out.println("Friut");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}
