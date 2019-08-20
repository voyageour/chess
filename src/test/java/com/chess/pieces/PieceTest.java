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
		actual = "H2,H3,H4,H5,H6,H7,H8,G1,F1,E1,D1,C1,B1,A1";

		Assert.assertEquals(actual, p.move());
	}

	@Test
	public void testBishopMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece p = new Piece("Bishop", "D5", board);
		String actual = "C6,B7,A8,E6,F7,G8,E4,F3,G2,H1,C4,B3,A2";

		Assert.assertEquals(actual, p.move());
	}

	@Test
	public void testBishopMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece p = new Piece("Bishop", "A8", board);

		String actual = "B7,C6,D5,E4,F3,G2,H1";
		Assert.assertEquals(actual, p.move());

		p = new Piece("Bishop", "H8", board);

		actual = "G7,F6,E5,D4,C3,B2,A1";
		Assert.assertEquals(actual, p.move());
	}

	@Test
	public void testHorseMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("Horse", "E3", board);
		String actual = "F5,G4,G2,F1,D1,C2,C4,D5";
		Assert.assertEquals(actual, piece.move());
	}

	@Test
	public void testHorseMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("Horse", "H1", board);
		String actual = "F2,G3";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Horse", "A1", board);
		actual = "B3,C2";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Horse", "A8", board);
		actual = "C7,B6";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Horse", "H8", board);
		actual = "G6,F7";
		Assert.assertEquals(actual, piece.move());
	}

	@Test
	public void testQueenMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("Queen", "D5", board);
		String actual = "C6,B7,A8,E6,F7,G8,E4,F3,G2,H1,C4,B3,A2,D6,D7,D8,E5,F5,G5,H5,D4,D3,D2,D1,C5,B5,A5";
		Assert.assertEquals(actual, piece.move());
	}

	@Test
	public void testQueenMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("Queen", "A8", board);
		String actual = "B7,C6,D5,E4,F3,G2,H1,B8,C8,D8,E8,F8,G8,H8,A7,A6,A5,A4,A3,A2,A1";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Queen", "A1", board);
		actual = "B2,C3,D4,E5,F6,G7,H8,A2,A3,A4,A5,A6,A7,A8,B1,C1,D1,E1,F1,G1,H1";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Queen", "H1", board);
		actual = "G2,F3,E4,D5,C6,B7,A8,H2,H3,H4,H5,H6,H7,H8,G1,F1,E1,D1,C1,B1,A1";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("Queen", "H8", board);
		actual = "G7,F6,E5,D4,C3,B2,A1,H7,H6,H5,H4,H3,H2,H1,G8,F8,E8,D8,C8,B8,A8";
		Assert.assertEquals(actual, piece.move());
	}

	@Test
	public void testKingMoves() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("King", "D5", board);
		String actual = "D6,E6,E5,E4,D4,C4,C5,C6";
		Assert.assertEquals(actual, piece.move());
	}

	@Test
	public void testKingMovesAtBoundary() throws Exception {
		IChessBoard board = new ChessBoard(8, 8);
		Piece piece = new Piece("King", "A1", board);
		String actual = "A2,B2,B1";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("King", "A8", board);
		actual = "B8,B7,A7";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("King", "H1", board);
		actual = "H2,G1,G2";
		Assert.assertEquals(actual, piece.move());

		piece = new Piece("King", "H8", board);
		actual = "H7,G7,G8";
		Assert.assertEquals(actual, piece.move());
	}

}
