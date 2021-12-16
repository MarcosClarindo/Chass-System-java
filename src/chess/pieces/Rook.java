package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	// Convertendo "Rook" para um String
	@Override
	public String toString() {
		return "R";
				
	}
	
}
