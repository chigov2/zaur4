package com.chigov.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dog",Dog.class);
        dog.say();
//        Dog dog1 = context.getBean("dog",Dog.class);
//        System.out.println(dog);
//        System.out.println(dog1);
        context.close();
    }
}
