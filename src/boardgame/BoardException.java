package boardgame;

public class BoardException extends RuntimeException {

	// Tratando as excess�es
	private static final long serialVersionUID = 1L;
	
	public BoardException (String msg) {
		super(msg);
	}
}
