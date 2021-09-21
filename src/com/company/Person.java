package com.company;

public class Person {
    private String navn;
    private int alder;

    public Person(String navn, int alder){
        this.navn = navn;
        this.alder = alder;

    }

    public Person(){
        this.navn = "Ali";
        this.alder = 25;
    }

    public String getNavn(){
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public void hasBirthday() {
            alder++;
    }


    @Override
    public String toString() {
        return "Person{" +
                "navn='" + navn + '\'' +
                ", alder=" + alder +
                '}';
    }
}
