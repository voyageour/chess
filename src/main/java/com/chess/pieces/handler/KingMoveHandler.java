package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class KingMoveHandler implements IMoveHandler {

	public static final String NAME = "KING";

	@Override
	public String possibleMoves(String srcPosition, IChessBoard board) {
		int[][] deltaMoves = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
		return IMoveHandler.possibleMoves(srcPosition, board, deltaMoves);
	}

}
