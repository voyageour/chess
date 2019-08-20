package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class HorseMoveHandler implements IMoveHandler {

	public static final String NAME = "HORSE";

	@Override
	public String possibleMoves(String srcPosition, IChessBoard board) {
		int[][] deltaMoves = { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 }, { -2, 1 }, { -1, 2 } };
		return IMoveHandler.possibleMoves(srcPosition, board, deltaMoves);
	}

}
