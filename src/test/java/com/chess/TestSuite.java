package com.chess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.chess.board.ChessBoardTest;
import com.chess.pieces.PieceTest;
import com.chess.pieces.PiecesMoveManagerTest;
import com.chess.pieces.handler.BishopMoveHandlerTest;
import com.chess.pieces.handler.HorseMoveHandlerTest;
import com.chess.pieces.handler.KingMoveHandlerTest;
import com.chess.pieces.handler.PawnMoveHandlerTest;
import com.chess.pieces.handler.QueenMoveHandlerTest;
import com.chess.pieces.handler.RookMoveHandlerTest;

@RunWith(Suite.class)
@SuiteClasses({ ChessBoardTest.class, PawnMoveHandlerTest.class, RookMoveHandlerTest.class, BishopMoveHandlerTest.class,
		HorseMoveHandlerTest.class, QueenMoveHandlerTest.class,KingMoveHandlerTest.class, PiecesMoveManagerTest.class, PieceTest.class })
public class TestSuite {

}
