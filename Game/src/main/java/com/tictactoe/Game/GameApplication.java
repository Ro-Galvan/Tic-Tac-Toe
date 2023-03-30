package com.tictactoe.Game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class GameApplication {
	public static void main(String[] args) {
//		SpringApplication.run(GameApplication.class, args);
//2D array
		char[][] gameBoard = {
				{'x', 'o', 'x'},
				{'x', 'x', 'x'},
				{'x', 'x', 'x'},
		};
//	adding symbols for the board game
//		I think it is better to add it this way then into the 2d array so there aren't too many indices
		System.out.println(gameBoard[0][0] + "|" +  gameBoard[0][1] + "|" + gameBoard[0][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[1][0] + "|" +  gameBoard[1][1] + "|" + gameBoard[1][2]);
		System.out.println("-+-+-");
		System.out.println(gameBoard[2][0] + "|" +  gameBoard[2][1] + "|" + gameBoard[2][2]);

	}

}
