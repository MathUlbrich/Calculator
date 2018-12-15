package calculator.operation;

public class SubtractionOperation implements Operation {

	@Override
	public Double operate(Double num1, Double num2) {
		return num1 - num2;
	}

}
