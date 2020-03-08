package com.cy.jvm.classLoader;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTest8 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        log.info(String.valueOf(classLoader));
        log.info("-----------------------------");
        while (null != classLoader) {
            classLoader = classLoader.getParent();
            log.info("{}",classLoader);
        }
    }
}
