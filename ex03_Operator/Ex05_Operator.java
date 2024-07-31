package ex03_Operator;

public class Ex05_Operator {
	public static void main(String[] args) {
		// 논리연산자
		// 피연산자를 두 개 필요로 하는 연산자
		// s 
		
		// &&은 And의 의미를 가지고 있다. 앞 뒤의 연산이 모두 True여야 True를 반환한다.
		//참 && 참 = 참
		//참 && 거짓 = 거짓
		//거짓 && 참 = 거짓
		//거짓 && 거짓 = 거짓
		//둘 다 참일때만 참
		
		int myAge = 30;
		int limit = 35;
		boolean result = (limit-myAge) >=  5 && myAge > 30;
		System.out.println(result);
		System.out.println(myAge);
		
		// || : or 의 의미를 가지고 있다
		// 앞 뒤의 피연산자 중 하나라도 true 면 true를 반환
		//참 || 참 = 참
		//참 || 거짓 = 참
		//거짓 || 참 = 참
		//거짓 || 거짓 = 거짓
		//한쪽만 참이어도 참
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11; // false
		System.out.println(result2);
		System.out.println(n2);
		
		
		
		
	}
}
