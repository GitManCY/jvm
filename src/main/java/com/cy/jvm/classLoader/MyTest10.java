package com.cy.jvm.classLoader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class MyTest10 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String resourceName = "/Users/a123/Desktop/my/Idea_workspace/jvm/src/main/java/com/cy/jvm/classLoader/MyTest10.java";

        Enumeration<URL> resources = classLoader.getResources(resourceName);
        while (resources.hasMoreElements()){
            URL url = resources.nextElement();
            System.out.println(url);
        }

    }
}
