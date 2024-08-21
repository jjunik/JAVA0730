package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest {
	Scanner sc = new Scanner(System.in);
	public void maxFinder(int[] arr	) {
		Arrays.sort(arr);
		System.out.println("배열의 최대값 : " + arr[arr.length - 1]);
	}
	
	public void fToc() {
		System.out.println("화씨를 섭씨로 바꾸는 메서드");
		System.out.print("화씨 입력 : ");
		double f = sc.nextDouble();
		double res = 1.8 * f + 32;
		System.out.println("결과 : " + res);
	}
	public void cTof() {
		System.out.println("섭씨를 화씨로 바꾸는 메서드");
		System.out.print("섭씨 입력 : ");
		double c = sc.nextDouble();
		double res = (c-32)/1.8;
		System.out.println("결과 : " + res);
	}
}
