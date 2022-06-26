package com.chigov.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet",Dog.class);
        Dog dog2 = context.getBean("myPet",Dog.class);

        dog.setName("Belkaa");
        dog2.setName("Strelkaa");
        System.out.println(dog.getName());
        System.out.println(dog2.getName());


        System.out.println("Compare: " + (dog==dog2));
        System.out.println(dog);
      System.out.println(dog2);
        context.close();
    }
}
