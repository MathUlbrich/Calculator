package calculator.operation;

public class SquareOperation implements Operation {

	@Override
	public Double operate(Double num1, Double num2) {
		return Math.pow(num1, 1.0/num2);
	}

}
