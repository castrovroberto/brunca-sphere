package me.castrovrob.brunca.core;

public class Cell {

    private int positionX;
    private int positionY;
    private boolean isPlayerIn;

    public Cell() {
        // no-arg constructor
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean getIsPlayerIn() {
        return isPlayerIn;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setIsPlayerIn(boolean value) {
        this.isPlayerIn = value;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", isPlayerIn=" + String.valueOf(isPlayerIn) +
                '}';
    }
}
