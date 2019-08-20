package com.chess.pieces;

import org.junit.Assert;
import org.junit.Test;

import com.chess.board.ChessBoard;
import com.chess.board.IChessBoard;

public class PieceTest {
	
	@Test
	public void testCreatePiece() throws Exception {
		
		String name = "Pawn";
		String position = "D5";
		IChessBoard board = new ChessBoard(8, 8);
		
		Piece p = new Piece(name, position, board);
		
		Assert.assertEquals(position, p.getPosition());
		Assert.assertEquals(board, p.getBoard());
	}
	
	@Test
	public void testPawnMove() throws Exception {
		
		IChessBoard board = new ChessBoard(8, 8);
		
		Piece p = new Piece("Pawn", "D5", board);
		String output = p.move();
		Assert.assertEquals("D6", output);
	}
	
	@Test
	public void testRookMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece p = new Piece("Rook", "D5", board);
		
		String actual = "D6,D7,D8,E5,F5,G5,H5,D4,D3,D2,D1,C5,B5,A5";
				
		Assert.assertEquals(actual, p.move());		
	}
	
	@Test
	public void testRookMovesAtBoundary() throws Exception {
		
		IChessBoard board = new ChessBoard(8, 8);
		Piece p = new Piece("Rook", "A8", board);		
		String actual = "B8,C8,D8,E8,F8,G8,H8,A7,A6,A5,A4,A3,A2,A1";
		
		Assert.assertEquals(actual, p.move());
		
		p = new Piece("Rook", "H1", board);
		actual="H2,H3,H4,H5,H6,H7,H8,G1,F1,E1,D1,C1,B1,A1";
		
		Assert.assertEquals(actual, p.move());		
	}

}
