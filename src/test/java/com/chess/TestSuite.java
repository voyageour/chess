package com.chess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.chess.board.ChessBoardTest;
import com.chess.pieces.PieceTest;
import com.chess.pieces.PiecesMoveManagerTest;

@RunWith(Suite.class)
@SuiteClasses({ ChessBoardTest.class, PiecesMoveManagerTest.class,PieceTest.class })
public class TestSuite {

}
