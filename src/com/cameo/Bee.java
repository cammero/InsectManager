package com.cameo;

/**
 * Created by Cameo on 11/18/2015.
 */
public class Bee extends Insect{

    private String bodyColor;
    private String favoriteFlower;
    private boolean makesHoney;

    //Constructor
    public Bee (String name, int numberOfWings, String bodyColor, String favFlower, boolean makesHoney){
        this.name = name;
        this.numberOfWings = numberOfWings;
        this.bodyColor = bodyColor;
        this.favoriteFlower = favFlower;
        this.makesHoney = makesHoney;
    }

    public void printSpeciesData() {
        System.out.println("The " + name + " has " + numberOfWings + " wings, and it's body is " + bodyColor + ". It has " +
                legs + " legs, and it's favorite flower is " + favoriteFlower + ".");
        if (makesHoney) {
            System.out.println("The " + name + " makes honey.");
        } else {
            System.out.println("The " + name + " does not make honey.");
        }
    }

    public String getBodyColor() {
        return bodyColor;
    }
    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }
    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public boolean isMakesHoney() {
        return makesHoney;
    }
    public void setMakesHoney(boolean makesHoney) {
        this.makesHoney = makesHoney;
    }
}
