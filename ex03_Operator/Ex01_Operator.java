package ex03_Operator;

public class Ex01_Operator {
	public static void main(String[] args) {
		
		// 단항 연산자
		// 피연산자가 한개인 연산자를 말하며
		// 부호연산자 +, - , 증감연산자 ++, -- , 논리부정연산자 ! 가 있다.
		
		int x = 100;
		int resultPuls = + x;
		int resultMinus = - x;
		
		System.out.println(resultPuls);
		System.out.println(resultMinus);
		
		
		double d = 1.11;
		double result = -d;
		System.out.println(result);
		System.out.println(-d); // - 1.11
		System.out.println(d); // 1.11
		
		
	}
}
