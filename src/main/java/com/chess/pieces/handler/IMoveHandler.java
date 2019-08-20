package com.chess.pieces.handler;

import com.chess.board.IChessBoard;

public interface IMoveHandler {
	
	static final String EMPTY_STR = "";
	
	static String reccuringPossibleMoves(String srcPosition,IChessBoard board,int[][] deltaMoves) {
		StringBuilder output = new StringBuilder();
		char[] currPosition = srcPosition.toCharArray();

		char r = currPosition[0];
		char c = currPosition[1];

		for (int i = 0; i < deltaMoves.length;) {
			r += deltaMoves[i][0];
			c += deltaMoves[i][1];
			if (board.evaluatePosition(r, c)) {
				output.append(r).append(c).append(",");
			} else {
				++i;
				// reset to current position
				r = currPosition[0];
				c = currPosition[1];
			}
		}
		return (output.length() == 0) ? EMPTY_STR : output.substring(0, output.length() - 1);
	}
	
	static String possibleMoves(String srcPosition,IChessBoard board,int[][] deltaMoves) {
		StringBuilder output = new StringBuilder();
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

	String possibleMoves(String srcPosition,IChessBoard board);
}
