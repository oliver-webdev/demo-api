package demo.api.exception;

public class BrCodeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrCodeNotFoundException(String message) {
		super(message);
	}
}
