package com.cy.jvm.classLoader;

/**
 * 线程上下文类加载器的一般使用模式（模式-使用-还原）
 *
 * ClassLoader cl = Thread.currentThread().getContextClassLoader();
 *
 * try{
 *     //获取
 *     Thread.currentThread().setContextClassLoader(target);
 *     //使用
 *     MyMethod();
 *  }finally{
 *     //还原
 *     Thread.currentThread().setContextClassLoader(cl);
 * }
 *
 * MyMethod里面调用了Thread.currentThread().getContextClassLoader() 获取当前线程的上下文类加载器做某事
 * 如果一个类又类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的（该类之前未被加载）
 *
 * ContextClassLoader 是为了破坏类加载的双亲委派机制
 *
 * 当高层的提供一了统一的接口让底层去实现 同时又要在高层加载（实例化）底层的类时，就必须要通过线程上下文类加载器来帮助高层的ClassLoader找到并加载该类
 */

public class MyTest15 {


}
