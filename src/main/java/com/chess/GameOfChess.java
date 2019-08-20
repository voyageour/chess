package com.chess;

import java.util.Scanner;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;
import com.chess.pieces.Piece;

public class GameOfChess {

	public static void main(String[] args) {

		GameOfChess chess = new GameOfChess();
		Scanner in = new Scanner(System.in);
		String input = "";
		do {
			System.out.print("Input - ");
			input = in.nextLine();
			chess.parseInput(input);
			String output = chess.playGame(input);
			System.out.println(output);
			System.out.print("Type q followed by Enter to Quit or Press Enter key to continue");
			input = in.nextLine();
		} while (input.compareToIgnoreCase("q") != 0);
	}

	private Boolean parseInput(String input) {
		String[] cmds = input.split(" ");

		if (cmds.length != 2) {
			System.out.println("Error : Too many args specified");
			return Boolean.FALSE;
		}

		return Boolean.TRUE;
	}

	private String play(String pieceName, String srcPosition) throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece(pieceName, srcPosition, board);
		return piece.move();
	}

	public String playGame(String input) {
		String result = "";
		if (parseInput(input)) {
			String[] cmds = input.split(" ");
			try {
				result = play(cmds[0], cmds[1]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

}
