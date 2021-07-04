package me.castrovrob.brunca.core;

public class Player {

    private int positionX;
    private int positionY;

    public Player(int mPositionX, int mPositionY) {
        this.positionX = mPositionX;
        this.positionY = mPositionY;
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
        return "Player{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
