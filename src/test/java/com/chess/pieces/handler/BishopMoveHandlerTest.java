package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class BishopMoveHandlerTest {
	
	@Test
	public void testBishopMoves() {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new BishopMoveHandler();
		String actual = "C6,B7,A8,E6,F7,G8,E4,F3,G2,H1,C4,B3,A2";
				
		Assert.assertEquals(actual, handler.possibleMoves("D5",board));		
	}
	
	@Test
	public void testBishopMovesAtBoundary() {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new BishopMoveHandler();
		
		String actual = "B7,C6,D5,E4,F3,G2,H1";		
		Assert.assertEquals(actual, handler.possibleMoves("A8",board));
		
		actual="G7,F6,E5,D4,C3,B2,A1";
		Assert.assertEquals(actual, handler.possibleMoves("H8",board));		
	}

}
