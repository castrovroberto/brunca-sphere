package me.castrovrob.brunca.core;

public class Cell {

    private int positionX;
    private int positionY;

    public Cell() {
        // no-arg constructor
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
