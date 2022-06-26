package com.chigov.demo;

public class Person {

    private Pet pet;
    private String lastName;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean is created with empty constructor");
    }

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
