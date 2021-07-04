package me.castrovrob.brunca.core;

public class Board {

    private int rows;
    private int columns;
    private Player player;

    private Cell[][] gameBoard;

    public Board(int mRows, int mColumns) {
        this.rows = mRows;
        this.columns = mColumns;
        
    }

    public void createGameBoard() {
        this.gameBoard = new Cell[this.rows][this.columns];
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                this.gameBoard[i][j] = new Cell();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setPlayer(int row, int column) {
        this.player = new Player(row, column, this);
        this.gameBoard[row][column].setIsPlayerIn(true);
    }

    public void movePlayer(String direction) {
        this.player.move(direction);
    }

    private String printLines() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append("   ");
        for(int i = 0; i < this.columns; i++) {
            stringBuilder.append("+-----");
        }
        stringBuilder.append("+");
        return stringBuilder.toString();
    }

    private String printNumbers() {
        StringBuilder stringBuilder = new StringBuilder();
        int columnNumber = 1;
        stringBuilder.append("   ");
        for(int i = 0; i < this.columns; i++) {
            stringBuilder.append("   " + columnNumber + "  ");
            columnNumber++;
        }
        return stringBuilder.toString();
    }

    public void drawBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.printNumbers());
        stringBuilder.append(this.printLines());

        char rowLetter = 'A';
        for(int i = 0; i < this.rows; i++) {
            stringBuilder.append("\n " + rowLetter);
            for(int j = 0; j < this.columns; j++) {
                stringBuilder.append(" | " + this.getCellContent(j, i) );
            }
            stringBuilder.append(" | " + rowLetter);
            rowLetter++;
            stringBuilder.append(this.printLines());
        }
        stringBuilder.append("\n");
        stringBuilder.append(this.printNumbers());

        System.out.println(stringBuilder.toString());
    }

    public void playerMoved(int prevRow, int prevColumn, 
                        int currRow, int currColumn) {
        if(this.gameBoard[prevRow][prevColumn].getIsPlayerIn()) {
            this.gameBoard[prevRow][prevColumn].setIsPlayerIn(false);
        }
        
        this.gameBoard[currRow][currColumn].setIsPlayerIn(true);
    }

    private String getCellContent(int row, int column) {
        String content = "   ";
        if(this.gameBoard[row][column].getIsPlayerIn()) {
            content = " x ";
        }
        return content;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GameInfo { " +
        "rows=" + this.rows +
        ", columns=" + this.columns +
        ", player=" + this.player.toString() +
        "}");
        return stringBuilder.toString();
    }
}
