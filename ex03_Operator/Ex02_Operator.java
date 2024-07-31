package ex03_Operator;

public class Ex02_Operator {
	public static void main(String[] args) {
		// 증감 연산자
		// 1씩 증가 시키거나 1씩 감소시키는 연산자
		// ++, --
		
		// 선행증감
		int a = 10;
		System.out.println("a : " + ++a);
		
		
		// 후행증감
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println("b : " + b);
		
		char alphabetA = 'A';
		System.out.println(alphabetA++);
		System.out.println(alphabetA);
		
		// 정수타입 연산에서 오버플로우가 발생하면 최소값으로 돌아간
		byte value = 127;
		value++;
		System.out.println(value);
		
		byte value2 = -128;
		value2--;
		System.out.println(value);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		// -------------------------------------------------
		// 논리 부정 연산자
		// boolean 값을 가지는 피연산자 앞에 !를 붙여서 값을 반대로
		// 바꾸는 역할을 한다.
		// true를 false로 false를 true로 바꿔줌
		
		boolean isHuman = false;
		System.out.println(isHuman);
		System.out.println(!isHuman);
		
		// 주의 할 점은, 논리 부정 연산자를 사용하더라도 사용한 곳에서만 
		// 적용될 뿐 원래 변수에 들어있는 값은 바뀌지 않는다
		
		
	}
}
