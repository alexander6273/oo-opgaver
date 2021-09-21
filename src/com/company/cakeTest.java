package com.company;

public class cakeTest {
    public static void main(String[] args) {

        Cake cake = new Cake();
        cake.vægtIngredienser();
        System.out.println(cake);
        cake.totalVægtAfKage();
        System.out.println(cake);
        cake.samledeEnergiMængde();
        System.out.println(cake);
    }
}
