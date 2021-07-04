package me.castrovrob.brunca.core;

public class Player {

    private Board board;
    private int positionX;
    private int positionY;

    public Player(int mPositionX, int mPositionY, Board mBoard) {
        this.positionX = mPositionX;
        this.positionY = mPositionY;
        this.board = mBoard;
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

    public void move(String direction) {
        switch(direction) {
            case "up":
                if(this.validateMove(this.positionX, this.positionY - 1)) {
                    this.board.playerMoved(this.positionX, this.positionY, this.positionX, this.positionY - 1);
                    this.positionY--;
                }
                break;
            case "down":
                if(this.validateMove(this.positionX, this.positionY + 1)) {
                    this.board.playerMoved(this.positionX, this.positionY, this.positionX, this.positionY + 1);
                    this.positionY++;
                }
                break;
            case "right":
                if(this.validateMove(this.positionX + 1, this.positionY)) {
                    this.board.playerMoved(this.positionX, this.positionY, this.positionX + 1, this.positionY);
                    this.positionX++;
                }
                break;
            case "left":
                if(this.validateMove(this.positionX - 1, this.positionY)) {
                    this.board.playerMoved(this.positionX, this.positionY, this.positionX - 1, this.positionY);
                    this.positionX--;
                }
                break;
            default:
                System.out.println("Cannot move there!");
                break;        
        }
    }

    private boolean validateMove(int posX, int posY) {
        boolean isMoveValid = false;

        if(!(posX < 0 || posX > this.board.getColumns())
        && !(posY < 0 || posY > this.board.getRows())) {
            isMoveValid = true;
        }

        return isMoveValid;
    }

    @Override
    public String toString() {
        return "Player{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
