package me.castrovrob.brunca.core;

public class Board {

    private int rows;
    private int columns;

    private Cell[][] gameBoard;

    public Board(int mRows, int mColumns) {
        this.rows = mRows;
        this.columns = mColumns;
        this.gameBoard = new Cell[this.rows][this.columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
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
                stringBuilder.append(" |    ");
            }
            stringBuilder.append(" | " + rowLetter);
            rowLetter++;
            stringBuilder.append(this.printLines());
        }
        stringBuilder.append("\n");
        stringBuilder.append(this.printNumbers());

        System.out.println(stringBuilder.toString());
    }

    @Override
    public String toString() {
        return "Board{" +
                "rows=" + rows +
                ", columns=" + columns +
                '}';
    }
}
