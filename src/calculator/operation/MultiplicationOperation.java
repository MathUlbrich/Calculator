package calculator.operation;

public class MultiplicationOperation implements Operation {

	@Override
	public Double operate(Double num1, Double num2) {
		return num1 * num2;
	}

}
