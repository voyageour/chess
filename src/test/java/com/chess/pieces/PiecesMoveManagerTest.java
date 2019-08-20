package com.chess.pieces;

import org.junit.Assert;
import org.junit.Test;

import com.chess.pieces.handler.IMoveHandler;
import com.chess.pieces.handler.PawnMoveHandler;

public class PiecesMoveManagerTest {

	@Test
	public void testPawnHandlers() {
		IMoveHandler handler = PiecesMoveManager.get("PAWN");
		Assert.assertEquals(PawnMoveHandler.class.getName(), handler.getClass().getName());
	}
	
	@Test
	public void testHandlersForCaseInsensitive() {
		IMoveHandler handler = PiecesMoveManager.get("pAWn");
		Assert.assertEquals(PawnMoveHandler.class.getName(), handler.getClass().getName());
	}
	
	@Test
	public void testIncorrectHandlers() {
		IMoveHandler handler = PiecesMoveManager.get("Bowler");
		Assert.assertNull(handler);
	}
	
	@Test
	public void testHandlersWithEmptyPieceName() {
		IMoveHandler handler = PiecesMoveManager.get(null);
		Assert.assertNull(handler);
		
		handler = PiecesMoveManager.get("");
		Assert.assertNull(handler);
		
		handler = PiecesMoveManager.get("              ");
		Assert.assertNull(handler);
	}
}
