package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public class PawnMoveHandler implements IMoveHandler {
	
	private final String EMPTY_STR = "";

	@Override
	public String possibleMoves(String srcPosition,IChessBoard board) {
		StringBuilder output = new StringBuilder();
		int deltaMoves[][] = { { 0, 1 } };
		char[] currPosition = srcPosition.toCharArray();

		for (int i = 0; i < deltaMoves.length; ++i) {
			char r = (char) (currPosition[0] + deltaMoves[i][0]);
			char c = (char) (currPosition[1] + deltaMoves[i][1]);
			if (board.evaluatePosition(r, c)) {
				output.append(r).append(c).append(",");
			}
		}
		return (output.length() == 0) ? EMPTY_STR : output.substring(0, output.length() - 1);
	}

}
