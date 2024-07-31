package ex03_Operator;

public class Ex03_Operator {
	public static void main(String[] args) {
		// 이항연산자
		// 피연산자가 두개인 연산자
		// 일반적으로 연산자를 가운데 두고 피연산자가 왼쪽, 오른쪽에 위치한다.
		
		// 산술연산자
		// 사칙연산(+, -, *)과 몫을 구하는 나누기(/)
		// 나머지를 구하는 나누기(%)로 나뉜다.
		// 프로그래밍에서는 곱셈은 * 나눗셈음 /, % 사용
		
		int x = 100;
		int y = 200;
		int result = x + y;
		
		System.out.println(result);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		// 계산 결과가 표현 범위를 벗어나면 오버플로우가 발생하거나 
		// 쓰레기 값이 입력된다.
		result = 1000000 * 100000; // int 범위: -21억~21억
		System.out.println(result);
		
		// 산술변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자으 ㅣ타입이 일치해야 연산 가능하다. 
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞춤
		// long + int -> long + long -> long
		// float + int -> float + float -> float
		// double + float -> double + double -> double
	
		float f1 = 3.14f;
		int i1 = 4;
		System.out.println(f1 + i1);
	
	
	
	
	}
}
