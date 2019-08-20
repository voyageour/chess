package com.chess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.chess.board.ChessBoardTest;
import com.chess.pieces.PieceTest;
import com.chess.pieces.PiecesMoveManagerTest;
import com.chess.pieces.handler.PawnMoveHandlerTest;
import com.chess.pieces.handler.RookMoveHandlerTest;

@RunWith(Suite.class)
@SuiteClasses({ ChessBoardTest.class,PawnMoveHandlerTest.class,RookMoveHandlerTest.class, PiecesMoveManagerTest.class,PieceTest.class })
public class TestSuite {

}
