package ex03_while;

import java.util.Scanner;

public class Ex01_While {
	public static void main(String[] args) {

//		int num = 1; // 초기식
//
//		while (num <= 10) {
//			System.out.println(num);
//			num++; // 증감식
//		}
//		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
//		int num1 = 0;
//
//		while (num1 != -1) {
//			System.out.print("정수 입력: ");
//			num1 = sc.nextInt();
//			System.out.println("입력된 정수: " + num1);
//		}
		// for문으로 만드는 무한루프
//		for(;;) {
//			
//		}
//		System.out.print("정수 입력: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		
//		while(n > 0) {
//			sum += n % 10;
//			n = n / 10;
//		}System.out.println("각 자리수의 합 : " + sum);
		
		
		
		for (int i = 1; i <= 6 ; i++) {
			
			for (int j = 1; j <= 6; j++) {
			if(i + j == 6) {
				System.out.println(i+", "+j);
			}
			}
			
		}
		System.out.println();
		
		int x = 1;
		
		while(x <= 6) {
			int y = 1;
			while(y <= 6) {
				if(x + y == 6) {
					System.out.println(x + ", " + y);
				} y++;
			}x++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
