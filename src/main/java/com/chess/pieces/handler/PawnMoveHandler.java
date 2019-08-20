package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class PawnMoveHandler implements IMoveHandler {
		
	public static final String NAME = "PAWN";

	@Override
	public String possibleMoves(String srcPosition,IChessBoard board) {		
		int deltaMoves[][] = { { 0, 1 } };
		return IMoveHandler.possibleMoves(srcPosition,board, deltaMoves);		
	}

}
