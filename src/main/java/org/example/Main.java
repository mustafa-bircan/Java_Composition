package org.example;

import org.example.model.Lamp;
import org.example.model.enums.LampType;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON, true, 75);

        lamp.turnOn();
        System.out.println("Style: " + lamp.getStyle());
        System.out.println("Battery: " + lamp.isBattery());
        System.out.println("Glob Rating: " + lamp.getGlobRating());
    }
}