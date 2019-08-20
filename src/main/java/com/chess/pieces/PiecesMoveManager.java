package com.chess.pieces;

import java.util.HashMap;
import java.util.Map;

import com.chess.pieces.handler.BishopMoveHandler;
import com.chess.pieces.handler.IMoveHandler;
import com.chess.pieces.handler.PawnMoveHandler;
import com.chess.pieces.handler.RookMoveHandler;

public class PiecesMoveManager {

	private final static Map<String, IMoveHandler> handlers = new HashMap<String, IMoveHandler>();

	static {
		init();
	}

	private static void init() {
		handlers.put(PawnMoveHandler.NAME, new PawnMoveHandler());
		handlers.put(RookMoveHandler.NAME, new RookMoveHandler());
		handlers.put(BishopMoveHandler.NAME, new BishopMoveHandler());
	}

	static IMoveHandler get(String pieceName) {
		IMoveHandler handler = null;

		if (pieceName != null) {
			handler = handlers.get(pieceName.toUpperCase());
		}

		return handler;
	}
}
