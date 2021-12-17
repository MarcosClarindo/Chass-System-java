package boardgame;

public class BoardException extends RuntimeException {

	// Tratando as excessões
	private static final long serialVersionUID = 1L;
	
	public BoardException (String msg) {
		super(msg);
	}
}
