package com.chess.pieces.handler;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class RookMoveHandlerTest {
	
	@Test
	public void testRookMoves() {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new RookMoveHandler();
		String actual = "D6,D7,D8,E5,F5,G5,H5,D4,D3,D2,D1,C5,B5,A5";
				
		Assert.assertEquals(actual, handler.possibleMoves("D5",board));		
	}
	
	@Test
	public void testRookMovesAtBoundary() {
		IChessBoard board = new ChessBoard(8, 8);
		IMoveHandler handler = new RookMoveHandler();
		
		String actual = "B8,C8,D8,E8,F8,G8,H8,A7,A6,A5,A4,A3,A2,A1";		
		Assert.assertEquals(actual, handler.possibleMoves("A8",board));
		
		actual="H2,H3,H4,H5,H6,H7,H8,G1,F1,E1,D1,C1,B1,A1";
		Assert.assertEquals(actual, handler.possibleMoves("H1",board));		
	}

}
