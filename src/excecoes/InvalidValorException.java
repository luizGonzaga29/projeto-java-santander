package excecoes;

public class InvalidValorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidValorException(String msg) {
		super(msg);
	}
}
