package ex05_Lambda;

public class CalculatorImpl implements Calculator{
	// 추상메서드 오버라이딩
	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

}
