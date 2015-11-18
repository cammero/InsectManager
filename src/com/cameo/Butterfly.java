package com.cameo;

/**
 * Created by Cameo on 11/18/2015.
 */
public class Butterfly extends Insect{
    private String wingColor;
    private String favoriteFlower;

    //Constructor
    public Butterfly(String name, int numberOfWings, String wingColor, String favFlower){
        this.name = name;
        this.numberOfWings = numberOfWings;
        this.wingColor = wingColor;
        this.favoriteFlower = favFlower;
    }

    public void printSpeciesData(){
        System.out.println("The " + name + " has " + numberOfWings + " " + wingColor + " wings, " +
        legs + " legs, and it's favorite flower is " + favoriteFlower + ".");
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }
}
