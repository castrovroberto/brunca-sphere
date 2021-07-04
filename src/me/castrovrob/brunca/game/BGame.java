package me.castrovrob.brunca.game;

import me.castrovrob.brunca.core.Board;

import java.util.Scanner;

public class BGame {
    private Board myBoard;
    private boolean isGameRunning;

    public BGame() {
        // no-arg constructor
        System.out.println("Welcome to Brunca Game!");
    }

    public static void main(String[] args) {
        BGame bGame = new BGame();
        bGame.init(10,10);
    }

    private void init(int rows, int columns) {
        System.out.println("You are trapped inside a Maze...");
        System.out.println("There's no much to do except to explore.");
        this.myBoard = new Board(rows, columns);
        this.isGameRunning = true;
        this.gameLoop();
    }

    private void handleUserInput() {
        System.out.println("Where do you want to move next?");
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            userInput = scanner.nextLine();
        }

        if(this.isGameRunning) {
            switch(userInput) {
                case "up":
                    System.out.println("Moving up!");
                    break;
                case "down":
                    System.out.println("Moving down!");
                    break;
                case "right":
                    System.out.println("Moving right!");
                    break;
                case "left":
                    System.out.println("Moving left!");
                    break;
                case "quit":
                    this.isGameRunning = false;
                    break;
                default:
                    System.out.println("Don't know what to do with " + userInput);

            }
        }
    }

    private void printBoard() {
        this.myBoard.drawBoard();
    }

    private void gameLoop() {
        while(this.isGameRunning) {
            this.printBoard();
            this.handleUserInput();
        }
    }
}
