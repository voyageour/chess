package com.chess.pieces;

import com.chess.board.IChessBoard;
import com.chess.pieces.handler.IMoveHandler;

public class Piece {
	
	private String position;
	private String name;
	private IChessBoard board;

	public Piece(String name,String position,IChessBoard board) throws Exception {
		this.board = board;
		this.name = name;
		this.position = position;		
		validate();
	}
	
	private void validate() throws Exception {
		char[] positions = position.toCharArray();
		if(!board.evaluatePosition(positions[0], positions[1])) {
			throw new Exception(String.format(" '%s' is not a valid position", position));
		}
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public IChessBoard getBoard() {
		return board;
	}

	public void setBoard(IChessBoard board) {
		this.board = board;
	}

	public String move() throws Exception {
		IMoveHandler handler = PiecesMoveManager.get(getName());
		if(handler == null) {
			String msg = String.format("Incorrect input: '%s' is not a valid piece name", getName());
			throw new Exception(msg);
		}
		return handler.possibleMoves(getPosition(),getBoard());
	}
}
