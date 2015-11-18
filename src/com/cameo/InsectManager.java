package com.cameo;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
        //Two butterfly objects
        Butterfly monarch = new Butterfly("Monarch", 4, "orange and black", "Milkweed");
        Butterfly commonYellowSwallowtail = new Butterfly("Common Yellow Swallowtail", 4, "yellow and black", "milk parsley");

        //monarch.printSpeciesData();
        //commonYellowSwallowtail.printSpeciesData();

        //Two bee objects
        Bee honeyBee = new Bee("Honey Bee", 4, "yellow and black", "Jasmine", true);
        Bee bumbleBee = new Bee("Bumble Bee", 4, "yellow, black and white", "Clover", false);

        //honeyBee.printSpeciesData();
        //bumbleBee.printSpeciesData();

        LinkedList<Insect> insects = new LinkedList<>();
        insects.add(monarch);
        insects.add(commonYellowSwallowtail);
        insects.add(honeyBee);
        insects.add(bumbleBee);
        for (Insect i : insects){
            i.printSpeciesData();
        }
    }
}
