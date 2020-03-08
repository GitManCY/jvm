package com.cy.jvm.byteCode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
    private Subject subject;

    public DynamicSubject(Subject subject) {
        this.subject = subject;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling:"+method);

        method.invoke(this.subject,args);

        System.out.println("post calling:"+method);
        return null;
    }
}
