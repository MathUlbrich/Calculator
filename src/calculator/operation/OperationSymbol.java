package calculator.operation;

public enum OperationSymbol {
	
	SUM(new SumOperation()), 
	SUB(new SubtractionOperation()), 
	MUL(new MultiplicationOperation()), 
	DIV(new DivisionOperation()),
	POW(new PowOperation()),
	ROT(new RootOperation());
	
	private Operation operation;
	
	private OperationSymbol(Operation operation) {
		this.operation = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}
}
