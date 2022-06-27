package com.chigov.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    //@Value("${person.lastName}")
    private String lastName;
    //@Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created with empty constructor");
    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("In class person set Pet");
        this.pet = pet;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello pet");
        pet.say();
    }
}
