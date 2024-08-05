package ex03_method;

public class Calc {
	// 두 수를 더하는 sum 메서드 만들기
	// 두 수의 합은 ~입니다 라는 출력문 작성하기
	// CalcMain 만들어서 메서드 호출하기
	
	
	void sum(int x, int y) {
		int plus = x + y;
		System.out.println("두 수의 합은 " + plus + "입니다.");
	}
	
	int sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
//		System.out.printf("숫자들의 합은 %d입니다.", result);
		return result;	
	}
	
}
