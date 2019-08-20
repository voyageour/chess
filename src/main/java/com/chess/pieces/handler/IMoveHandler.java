package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public interface IMoveHandler {		

	String possibleMoves(String srcPosition,IChessBoard board);
}
