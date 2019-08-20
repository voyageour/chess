package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class QueenMoveHandlerTest {

	@Test
	public void testQueenMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new QueenMoveHandler();

		String actual = "C6,B7,A8,E6,F7,G8,E4,F3,G2,H1,C4,B3,A2,D6,D7,D8,E5,F5,G5,H5,D4,D3,D2,D1,C5,B5,A5";
		Assert.assertEquals(actual, handler.possibleMoves("D5", board));
	}

	@Test
	public void testQueenMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new QueenMoveHandler();

		String actual = "B7,C6,D5,E4,F3,G2,H1,B8,C8,D8,E8,F8,G8,H8,A7,A6,A5,A4,A3,A2,A1";
		Assert.assertEquals(actual, handler.possibleMoves("A8", board));

		actual = "B2,C3,D4,E5,F6,G7,H8,A2,A3,A4,A5,A6,A7,A8,B1,C1,D1,E1,F1,G1,H1";
		Assert.assertEquals(actual, handler.possibleMoves("A1", board));

		actual = "G2,F3,E4,D5,C6,B7,A8,H2,H3,H4,H5,H6,H7,H8,G1,F1,E1,D1,C1,B1,A1";
		Assert.assertEquals(actual, handler.possibleMoves("H1", board));

		actual = "G7,F6,E5,D4,C3,B2,A1,H7,H6,H5,H4,H3,H2,H1,G8,F8,E8,D8,C8,B8,A8";
		Assert.assertEquals(actual, handler.possibleMoves("H8", board));
	}

}
