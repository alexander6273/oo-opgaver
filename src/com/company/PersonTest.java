package com.company;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person);
        System.out.println(person.getNavn());
        System.out.println(person.getAlder());


        person.hasBirthday();

        System.out.println(person);
    }

}
