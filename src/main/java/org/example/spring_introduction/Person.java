package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    private Pet pet;
        @Value("${person.surname}")
    private String surname;
        @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person Bean is created");
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    //    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
//        System.out.println("Person Bean is created");
//        this.pet = pet;
//    }
    public Person(Pet pet) {
        System.out.println("Person Bean is created");
        this.pet = pet;
    }

    //    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
