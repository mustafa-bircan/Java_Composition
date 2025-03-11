package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor paintColor;

    public Carpet(int width, int height, PaintColor paintColor) {
        this.width = width;
        this.height = height;
        this.paintColor = paintColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return paintColor;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
