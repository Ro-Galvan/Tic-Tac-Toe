package com.tictactoe.Game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class GameApplication {
	public static void main(String[] args) {
//		SpringApplication.run(GameApplication.class, args);
//2D array
		char[][] gameBoard = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '},
		};

//		extracted the printBoard symbols into its own method to avoid DRY
		printBoard(gameBoard);

//		adding Scanner class so the user can be prompted to enter X or O
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select a number on the board where you would like to place your game piece?");
		String input = scanner.nextLine();
		System.out.println(input);

//		Using switch case for options on where to place game piece

		switch (input) {
			case "1":
				gameBoard[0][0] = 'X';
				break;
			case "2":
				gameBoard[0][1] = 'X';
				break;
			case "3":
				gameBoard[0][2] = 'X';
				break;
			case "4":
				gameBoard[1][0] = 'X';
				break;
			case "5":
				gameBoard[1][1] = 'X';
				break;
			case "6":
				gameBoard[1][2] = 'X';
				break;
			case "7":
				gameBoard[2][0] = 'X';
				break;
			case "8":
				gameBoard[2][1] = 'X';
				break;
			case "9":
				gameBoard[2][2] = 'X';
				break;
			default:
				System.out.println("Please try a valid input");
		}

		printBoard(gameBoard);
	}

	//	adding symbols for the board game
//		I think it is better to add it this way then into the 2d array so there aren't too many indices
	private static void printBoard(char[][] gameBoard) {
		System.out.println(gameBoard[0][0] + "|" +  gameBoard[0][1] + "|" + gameBoard[0][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[1][0] + "|" +  gameBoard[1][1] + "|" + gameBoard[1][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[2][0] + "|" +  gameBoard[2][1] + "|" + gameBoard[2][2]);
	}

}
