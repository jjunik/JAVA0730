package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		} 
		System.out.println("1부터 n까지의 총합 : " + result);
	}
}
