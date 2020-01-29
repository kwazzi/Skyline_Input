package sample;

import javafx.scene.paint.Color;

public class Building {
    private double startingPos;
    private double width;
    private double height;
    private Color color;

    public Building(){

    }

    public void drawBuilding(){

    }

    public Color getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getStartingPos() {
        return startingPos;
    }

    public double getWidth() {
        return width;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setStartingPos(double startingPos) {
        this.startingPos = startingPos;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
