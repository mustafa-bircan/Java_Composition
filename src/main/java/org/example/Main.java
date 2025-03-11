package org.example;

import org.example.model.Bed;
import org.example.model.Lamp;
import org.example.model.enums.LampType;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON, true, 75);

        lamp.turnOn();
        System.out.println("Style: " + lamp.getStyle());
        System.out.println("Battery: " + lamp.isBattery());
        System.out.println("Glob Rating: " + lamp.getGlobRating());

        Bed bed = new Bed("Modern", 4, 50, 2, 1);

        bed.make();
        System.out.println("Pillows: " + bed.getPillows());
        System.out.println("Height: " + bed.getHeight());
        System.out.println("Sheets: " + bed.getSheets());
        System.out.println("Quilt: " + bed.getQuilt());
    }
}