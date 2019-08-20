package com.chess.pieces;

import java.util.HashMap;
import java.util.Map;

import com.chess.pieces.handler.IMoveHandler;
import com.chess.pieces.handler.PawnMoveHandler;

public class PiecesMoveManager {

	private final static Map<String, IMoveHandler> handlers = new HashMap<String, IMoveHandler>();

	static {
		init();
	}

	private static void init() {
		handlers.put("PAWN", new PawnMoveHandler());
	}

	static IMoveHandler get(String pieceName) {
		IMoveHandler handler = null;

		if (pieceName != null) {
			handler = handlers.get(pieceName.toUpperCase());
		}

		return handler;
	}
}
