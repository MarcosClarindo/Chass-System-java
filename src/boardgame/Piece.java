package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	public Piece(Board board) {
		
		this.board = board;
		position = null;
	}
	
	// n�o pode ser acessado por outra classe, somente subclasses
	protected Board getBoard() {
		return board;
	}
	
}
