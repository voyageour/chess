package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;
import com.chess.pieces.Piece;

public class HorseMoveHandlerTest {
	
	@Test
	public void testHorseMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new HorseMoveHandler();
				
		String actual = "F5,G4,G2,F1,D1,C2,C4,D5";
		Assert.assertEquals(actual, handler.possibleMoves("E3", board));
	}

	@Test
	public void testHorseMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new HorseMoveHandler();
		
		Piece piece = new Piece("Horse", "H1", board);
		String actual = "F2,G3";
		Assert.assertEquals(actual, handler.possibleMoves("H1", board));

		piece = new Piece("Horse", "A1", board);
		actual = "B3,C2";
		Assert.assertEquals(actual, handler.possibleMoves("A1", board));

		piece = new Piece("Horse", "A8", board);
		actual = "C7,B6";
		Assert.assertEquals(actual, handler.possibleMoves("A8", board));

		piece = new Piece("Horse", "H8", board);
		actual = "G6,F7";
		Assert.assertEquals(actual, handler.possibleMoves("H8", board));
	}

}
