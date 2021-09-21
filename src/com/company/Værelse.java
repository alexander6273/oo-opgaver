package com.company;

public class Værelse {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        //System.out.println(lamp);

        /*lamp.trykPåKontakt();
        System.out.println(lamp);
        lamp.trykPåKontakt();
        System.out.println(lamp);
        lamp.trykPåKontakt();
        System.out.println(lamp);
        lamp.trykPåKontakt();
        System.out.println(lamp);*/

        Lamp skriveBord = new Lamp();
        System.out.println("skrivebords lampe er " + skriveBord);
        skriveBord.trykPåKontakt();
        System.out.println(skriveBord);

        Lamp loftLampe = new Lamp();
        System.out.println(loftLampe);
        loftLampe.trykPåKontakt();
        System.out.println(loftLampe);
    }
}
