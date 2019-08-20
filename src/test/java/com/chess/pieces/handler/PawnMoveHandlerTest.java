package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class PawnMoveHandlerTest {

	@Test
	public void testPawnMoveHandler() {
		
		IChessBoard board = new ChessBoard(8, 8);
		
		IMoveHandler handler = new PawnMoveHandler();
		String actual = handler.possibleMoves("H7", board);
		Assert.assertEquals("H8", actual);
	}
	
	@Test
	public void testPawnMoveHandlerForBoundaryPosition() {
		
		IChessBoard board = new ChessBoard(8, 8);		
		IMoveHandler handler = new PawnMoveHandler();
		
		String actual = handler.possibleMoves("H8", board);
		Assert.assertTrue(actual.isEmpty());
		
		actual = handler.possibleMoves("A8", board);
		Assert.assertTrue(actual.isEmpty());
		
		actual = handler.possibleMoves("D8", board);
		Assert.assertTrue(actual.isEmpty());
		
		actual = handler.possibleMoves("A5", board);
		Assert.assertFalse(actual.isEmpty());
		
		actual = handler.possibleMoves("H5", board);
		Assert.assertFalse(actual.isEmpty());
		
		actual = handler.possibleMoves("C1", board);
		Assert.assertFalse(actual.isEmpty());
		
		actual = handler.possibleMoves("G1", board);
		Assert.assertFalse(actual.isEmpty());
	}
}
