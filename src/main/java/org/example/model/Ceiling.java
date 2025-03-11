package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintColor;

    public Ceiling(int height, PaintColor paintColor) {
        this.height = height;
        this.paintColor = paintColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }

    public void create() {
        System.out.println("Ceiling has been built.");
    }
}
