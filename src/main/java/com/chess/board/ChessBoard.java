package com.chess.board;

public class ChessBoard implements IChessBoard {
	
	private final int rows;
	private final int cols;

	public ChessBoard (int rows,int cols) {
		this.rows = rows;
		this.cols = cols;
	}

	@Override
	public int getRows() {
		return rows;
	}

	@Override
	public int getCols() {
		return cols;
	}

	@Override
	public Boolean evaluatePosition(char dstRow, char dstCol) {
		int currRow = Character.toUpperCase(dstRow) - 'A';
		int currCol = dstCol - '1';
		return !(currRow >= rows || currRow < 0 || currCol >= cols || currCol < 0);
	}

}
