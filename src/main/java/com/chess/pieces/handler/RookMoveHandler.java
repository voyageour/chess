package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class RookMoveHandler implements IMoveHandler {
	
	public static final String NAME = "ROOK";

	@Override
	public String possibleMoves(String srcPosition, IChessBoard board) {
		int[][] deltaMoves = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		return IMoveHandler.reccuringPossibleMoves(srcPosition, board, deltaMoves);
	}

}
