/**
 * 
 */
package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class BishopMoveHandler implements IMoveHandler {

	public static final String NAME = "BISHOP";

	@Override
	public String possibleMoves(String srcPosition, IChessBoard board) {
		int[][] deltaMoves = { { -1, 1 }, { 1, 1 }, { 1, -1 }, { -1, -1 } };
		return IMoveHandler.reccuringPossibleMoves(srcPosition,board,deltaMoves);
	}

}
