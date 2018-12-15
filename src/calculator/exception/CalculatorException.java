package calculator.exception;

public class CalculatorException extends Exception {

	private static final long serialVersionUID = 5794306484799526210L;
	
	public static final String OPERATION_NOT_FOUND = "The informed operation has not founded.";
	
	public CalculatorException(String message, final Throwable t) {
		super(message, t);
	}
	
}
