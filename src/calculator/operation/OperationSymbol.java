package calculator.operation;

public enum OperationSymbol {
	
	SUM(new SumOperation()), 
	SUB(new SubtractionOperation()), 
	MULTI(new MultiplicationOperation()), 
	DIV(new DivisionOperation()),
	POW(new PowOperation()),
	SQRT(new SquareOperation());
	
	private Operation operation;
	
	private OperationSymbol(Operation operation) {
		this.operation = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}
}
