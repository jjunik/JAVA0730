package ex03_method;

import java.util.Arrays;

public class MethodTest {
// 배열의 최대값을 찾아 출력하는 maxFinder 메서드 작성
// 배열은 매개변수로 전달받는다.
	int maxFinder(int[] sum) {
		int max = 0;
		Arrays.sort(sum);
		System.out.println("최대값 : " + sum[sum.length - 1]);
		return max;
}
	
// 계산기 만들기
// main에서 숫자 두 개랑 산술연산자 전달받아서 계산을 해서 반환하는
// getResult 메서드 만들기'
	int getResult(int x, int y, String calc) {
		int result = 0;
		switch(calc) {
		case "+" :
			return x + y;
			
		
		case "-" :
			return x - y;
			
		
		case "*" :
			return x * y;
			
		
		case "/" :
			return x / y;
			
			default :
				System.out.println("다시 입력하세요.");
				return -1;
		}
		
	
		
		
		
	}
	
}

