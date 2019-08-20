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
	public void testRookMove() throws Exception {
		
		IChessBoard board = new ChessBoard(8, 8);
		
		Piece p = new Piece("Pawn", "D5", board);
		String output = p.move();
		Assert.assertEquals("D6", output);
	}

}
