package com.cy.jvm.byteCode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicTest {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        InvocationHandler dynamicSubject = new DynamicSubject(subject);
        Class<?> aClass = dynamicSubject.getClass();

        Subject sub = (Subject) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), dynamicSubject);

        sub.request();
        System.out.println(sub.getClass());
    }
}
