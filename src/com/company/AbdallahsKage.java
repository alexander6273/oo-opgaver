package com.company;

import java.util.Scanner;


public class AbdallahsKage {

    public static void main(String[] args) {

        int ANTAL_PERSONER = 1;
        int gramSukker = 50;
        int gramMel = 75;
        int gramGær = 5;
        int antalÆg = 1;
        int mlOlie = 25;

        System.out.println("indtast antallet af personer der skal nyde kagen");
        Scanner scan = new Scanner(System.in);

        int antalPersoner = scan.nextInt();
        gramSukker = gramSukker * antalPersoner;

        System.out.println(gramSukker + " gram sukker");
        System.out.println(gramMel + "gram mel");
        System.out.println(gramGær + "gram gær");
        System.out.println(antalÆg + "antal æg");
        System.out.println(mlOlie + "ml Olie");


        int gramOlie = 20;
// 1 ml olie svarer til ca. 0.8g

        int gramÆg = 45;
// et æg vejer ca. 45g

        int vægtMel = gramMel * antalPersoner;
        int vægtGær = gramGær * antalPersoner;
        int vægtSukker = gramSukker * antalPersoner;

        double vægtÆg = (gramÆg * antalPersoner * antalÆg);
        double vægtOlie = (gramOlie * antalPersoner * mlOlie);

//Udskriv mængder til antal personer
        System.out.println("Til " + antalPersoner + " personer, skal du bruge ");
        System.out.println(vægtSukker + " gram sukker ");
        System.out.println(vægtMel + " gram mel ");
        System.out.println(vægtGær + " gram gær ");
        System.out.println(vægtÆg + " gram æg ");
        System.out.println(vægtOlie + " ml olie ");


// Kagens totalvægt

        double vægtTotal = (vægtSukker + vægtMel + vægtGær + vægtÆg + vægtOlie);
        System.out.println("Opskriftens samlede vægt er: " + vægtTotal + " gram ");

        System.out.println("Kagen kommer til at veje ca. " + vægtTotal + " gram ");

//Kagens ernæring pr. 100g/kJ

        double kjSukker = 10;
        double kjMel = 10;
        double kjGær = 5;
        double kjOlie = 13;
        double kjÆg = 3;

        System.out.println("Sukkeret i kagen indeholder: " + (vægtSukker * kjSukker) + " kJ ");
        System.out.println("mel i kagen indeholder: " + (vægtMel * kjMel) + " kJ ");
        System.out.println("Gær i kagen indeholder: " + (vægtGær * kjGær) + " kJ ");
        System.out.println("Olie i kagen indeholder: " + (vægtOlie * kjOlie) + " kJ ");
        System.out.println("Æg i kagen indeholder: " + (vægtÆg * kjÆg) + " kJ ");

        double samletKJ = (vægtSukker * kjSukker) + (vægtMel * kjMel) + (vægtSukker * kjSukker) + (vægtGær * kjGær) + (vægtOlie * kjOlie) + (vægtÆg * kjÆg);

        System.out.println("Kagen indeholder i alt: " + samletKJ + " kJ");
    }

}

// der er noget galt når jeg kører programmet, så for jeg helt urealistiske værdier ind, så det ender med at blive en kaloriebombe
// jeg har ændret i værdierne, men får stadigvæk urealistiske tal...

