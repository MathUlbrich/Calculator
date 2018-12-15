package calculator;

import java.util.Scanner;
import calculator.exception.CalculatorException;
import calculator.operation.Operation;
import calculator.operation.OperationFactory;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {		
			System.out.println("Type the first operator: ");
			Double num1 = Double.parseDouble(scanner.nextLine());
			System.out.println("Type the second operator: ");
			Double num2 = Double.parseDouble(scanner.nextLine());

			System.out.println("Type the operation: ");
			String operationInput = scanner.nextLine();
			Operation operation = OperationFactory.createBy(operationInput);
			System.out.println("Result => " + operation.operate(num1, num2));
		} catch (final CalculatorException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
