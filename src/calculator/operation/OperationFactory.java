package calculator.operation;

import calculator.exception.CalculatorException;

public abstract class OperationFactory {
	
	public static Operation createBy(final String symbol) throws CalculatorException {
		try {
			return OperationSymbol.valueOf(symbol).getOperation();
		} catch (IllegalArgumentException e) {
			throw new CalculatorException(CalculatorException.OPERATION_NOT_FOUND, e);
		}
	}
	
}
