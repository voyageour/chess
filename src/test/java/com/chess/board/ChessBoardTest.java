package com.chess.board;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

	@Test
	public void testCreateBoard() {

		IChessBoard board = new ChessBoard(8, 8);
		Assert.assertEquals(8, board.getRows());
		Assert.assertEquals(8, board.getCols());

	}

	@Test
	public void testBoardsPosition() {

		// create board
		IChessBoard board = new ChessBoard(8, 8);

		char[] input = "A5".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "h5".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));
	}

	@Test
	public void testBoardsBoundaryPosition() {

		// create board
		IChessBoard board = new ChessBoard(8, 8);

		char[] input = "A8".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "H1".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "A1".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "H8".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "e8".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));

		input = "d1".toCharArray();
		Assert.assertEquals(Boolean.TRUE, board.evaluatePosition(input[0], input[1]));
	}

	@Test
	public void testBoardsInvalidPosition() {

		// create board
		IChessBoard board = new ChessBoard(8, 8);

		char[] input = "A9".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));

		input = "I1".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));

		input = "AA".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));

		input = "88".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));

		input = "l8".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));

		input = "d0".toCharArray();
		Assert.assertEquals(Boolean.FALSE, board.evaluatePosition(input[0], input[1]));
	}

}
