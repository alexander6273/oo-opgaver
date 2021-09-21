package com.company;

import java.util.Arrays;

public class DiceTest {
    public static void main(String[] args) {

        Dice dice = new Dice();


        System.out.println(dice);

        dice.roll();
        System.out.println(dice);

        int[] fiveDice = new int[5];

        for (int i = 0; i < 5; i++) {
            dice.roll();
            fiveDice[i] = dice.getFaceValue();
        }
        System.out.println(Arrays.toString(fiveDice));

        int sum = 0;
        for (int value : fiveDice){
            sum += value;
        }
        System.out.println(sum);
    }

}
