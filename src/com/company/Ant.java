package com.company;

import javafx.scene.paint.Color;

/**
 * Created by erikjakubowski on 1/19/17.
 */
public class Ant {
    double x;
    double y;
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Ant(Color color) {
        this.color = color;
    }

    public Ant(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
