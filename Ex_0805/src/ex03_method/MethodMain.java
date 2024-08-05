package ex03_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MethodTest max = new MethodTest();
		int[] sum = {100,200,300,50};
		max.maxFinder(sum);
		
		System.out.print("첫 번째 숫자 입력 : ");
		int x = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int y = sc.nextInt();
		System.out.print("연산기호 입력 : ");
		String calc = sc.next();
		int result = max.getResult(x, y, calc);
		System.out.println("결과 = " + result);
		
		
		
	}
}
