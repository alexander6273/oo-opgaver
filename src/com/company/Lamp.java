package com.company;

public class Lamp {
    private boolean ligthOn;

    public Lamp(boolean ligthOn){
        this.ligthOn = ligthOn;
    }

    public Lamp(){
        this.ligthOn = false;
    }

    public void trykPåKontakt(){
        this.ligthOn = !ligthOn;

        /*if (!ligthOn){
            this.ligthOn = true;
        } else {
            this.ligthOn = false;
        }*/
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "ligthOn=" + ligthOn +
                '}';
    }
}
