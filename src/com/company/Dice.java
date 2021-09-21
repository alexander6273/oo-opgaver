package com.company;


import java.util.Random;

public class Dice {
    private int faceValue;

    public Dice(int faceValue){
        this.faceValue = faceValue;
    }

    public Dice(){
        this.faceValue = 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll(){
        //Random random = new Random(6);
        faceValue = 1 + ((int) (Math.random() * 6));
    }

    @Override
    public String toString() {
        return "Dice{" +
                "faceValue=" + faceValue +
                '}';
    }
}
