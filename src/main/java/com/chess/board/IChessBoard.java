package com.chess.board;

public interface IChessBoard {

	int getRows();
	
	int getCols();
	
	Boolean evaluatePosition(char dstRow,char dstCol);
	
}
