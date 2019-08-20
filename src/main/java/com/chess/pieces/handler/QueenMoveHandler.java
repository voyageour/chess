package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class QueenMoveHandler implements IMoveHandler {

	public static final String NAME = "QUEEN";

	@Override
	public String possibleMoves(String srcPosition, IChessBoard board) {
		int[][] deltaBishopMoves = { { -1, 1 }, { 1, 1 }, { 1, -1 }, { -1, -1 } };
		int[][] deltaRookMoves = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		StringBuilder output = new StringBuilder(
				IMoveHandler.reccuringPossibleMoves(srcPosition, board, deltaBishopMoves));
		output.append(",").append(IMoveHandler.reccuringPossibleMoves(srcPosition, board, deltaRookMoves));

		return output.toString();
	}

}
