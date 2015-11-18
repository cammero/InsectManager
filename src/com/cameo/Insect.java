package com.cameo;

/**
 * Created by Cameo on 11/17/2015.
 */
public abstract class Insect {
    public final int legs = 6;
    protected String name;
    protected int numberOfWings;

    public abstract void printSpeciesData();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }
    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
}
