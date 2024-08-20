package ex02_Enum;

public enum Operation {
	
PLUS("+"){
	// 추상메서드가 정의되면 상수객체에서 반드시 재정의 해야한다.
	@Override
	public double apply(double x, double y) {
		
		return x + y;
	}
},
MINUS("-"){
	@Override
	public double apply(double x, double y) {
		
	return x - y;
}
},
MULTI("*"){
	@Override
	public double apply(double x, double y) {
		
		return x * y;
	}
},
DIVIDE("/"){
	@Override
	public double apply(double x, double y) {
		
		return x / y;
	}
};
	protected final String op;
	Operation(String op) {
		this.op = op;
}

	public abstract double apply(double x, double y);

	public String getOp() {
		return op;
	}
}