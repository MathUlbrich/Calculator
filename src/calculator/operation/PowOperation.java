package calculator.operation;

public class PowOperation implements Operation {

	@Override
	public Double operate(Double num1, Double num2) {
		return Math.pow(num1, num2);
	}

}
