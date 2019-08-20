package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class KingMoveHandlerTest {

	@Test
	public void testKingMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new KingMoveHandler();

		String actual = "D6,E6,E5,E4,D4,C4,C5,C6";
		Assert.assertEquals(actual, handler.possibleMoves("D5", board));
	}

	@Test
	public void testKingMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new KingMoveHandler();

		String actual = "A2,B2,B1";
		Assert.assertEquals(actual, handler.possibleMoves("A1", board));

		actual = "B8,B7,A7";
		Assert.assertEquals(actual, handler.possibleMoves("A8", board));

		actual = "H2,G1,G2";
		Assert.assertEquals(actual, handler.possibleMoves("H1", board));

		actual = "H7,G7,G8";
		Assert.assertEquals(actual, handler.possibleMoves("H8", board));
	}

}
