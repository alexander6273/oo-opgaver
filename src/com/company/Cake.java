package com.company;

import java.util.Scanner;

public class Cake {

    private int ingredienser;
    private int antalPersoner;
    Scanner scan = new Scanner(System.in);

    private int vægtMel;
    private int vægtGær;
    private int vægtSukker;
    private double vægtÆg;
    private double vægtOlie;


    public Cake (int ingredienser, int antalPersoner){
        this.ingredienser = ingredienser;
        this.antalPersoner = antalPersoner;
    }

    public Cake(){
        this.ingredienser = ingredienser;
        this.antalPersoner = antalPersoner;
    }

    public int getIngredienser() {
        return ingredienser;
    }
    public int getoner() {
        return antalPersoner;
    }

    public void setIngredienser(int ingredienser) {
        this.ingredienser = ingredienser;
    }
    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
    }


   public void vægtIngredienser() {
       int ANTAL_PERSONER = 1;
       int gramSukker = 50;
       int gramMel = 75;
       int gramGær = 5;
       int antalÆg = 1;
       int mlOlie = 25;

       System.out.println();
       System.out.print("Indtast antallet af personer, der skal nyde kagen?: ");
       int antalPersoner = scan.nextInt();
       gramSukker = gramSukker * antalPersoner;

       System.out.println(gramSukker + " gram sukker");
       System.out.println(gramMel + "gram mel");
       System.out.println(gramGær + "gram gær");
       System.out.println(antalÆg + "antal æg");
       System.out.println(mlOlie + "ml Olie");


       double gramOlie = mlOlie * 0.8;
       int gramÆg = 45;
       vægtMel = gramMel * antalPersoner;
       vægtGær = gramGær * antalPersoner;
       vægtSukker = gramSukker * antalPersoner;

       vægtÆg = (gramÆg * antalPersoner * antalÆg);
       vægtOlie = (gramOlie * antalPersoner * mlOlie);

       //Udskriv mængder til antal personer
       System.out.println();
       System.out.println("Til " + antalPersoner + " personer, skal du bruge: ");
       System.out.println(vægtSukker + " gram sukker ");
       System.out.println(vægtMel + " gram mel ");
       System.out.println(vægtGær + " gram gær ");
       System.out.println(vægtÆg + " gram æg ");
       System.out.println(vægtOlie + " ml olie ");

   }

   public void totalVægtAfKage(){
       double vægtTotal = (vægtSukker + vægtMel + vægtGær + vægtÆg + vægtOlie);
       System.out.println("Opskriftens samlede vægt er: " + vægtTotal + " gram ");

       System.out.println("Kagen kommer til at veje ca. " + vægtTotal + " gram ");

   }

   public void samledeEnergiMængde(){
       double kjSukker = 10;
       double kjMel = 10;
       double kjGær = 5;
       double kjOlie = 5;
       double kjÆg = 3;

       System.out.println("Sukkeret i kagen indeholder: " + (vægtSukker * kjSukker) + " kJ ");
       System.out.println("mel i kagen indeholder: " + (vægtMel * kjMel) + " kJ ");
       System.out.println("Gær i kagen indeholder: " + (vægtGær * kjGær) + " kJ ");
       System.out.println("Olie i kagen indeholder: " + (vægtOlie * kjOlie) + " kJ ");
       System.out.println("Æg i kagen indeholder: " + (vægtÆg * kjÆg) + " kJ ");

       double samletKJ = (vægtSukker * kjSukker) + (vægtMel * kjMel) + (vægtSukker * kjSukker) +
               (vægtGær * kjGær) + (vægtOlie * kjOlie) + (vægtÆg * kjÆg);

       System.out.println("Kagen indeholder i alt: " + samletKJ + " kJ");
   }

    @Override
    public String toString() {
        return "";
    }
}
