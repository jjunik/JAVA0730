package ex02_for;
import java.util.Scanner;
public class Ex01_For {
	public static void main(String[] args) {
		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(i);
//		}
//		System.out.println("--------------------------------------------------");
//		for (int i = 1; i <= 10 ; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		for (int i = 10; i > 0; i--) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 1; i <= 20; i++) {
//			if(i % 2 == 0) {
//
//			}else if(i % 2 == 1){
//				System.out.print(i + " ");
//			}
//		}
//		
//		System.out.println();
//		
//		for (int i = 3; i < 11; i += 3) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		int result = 0;
//		for (int i = 1; i < 11; i++) {
//			result += i;
//		}System.out.println(result);
//		
//		int dan = 5 ;
//		
//		for (int i = 1; i < 10 ; i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//		}
//		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int a = sc.nextInt();
//		int total = 0;
//		for (int i = 1; i <= a; i++) {
//			total += i;
//		}System.out.println(total);
//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i+1 + "번 째 정수 입력: ");
//			int a = sc.nextInt();
//			if(a % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.println("짝수인 정수는 "+count + "개");
		System.out.print("첫 번째 정수: ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int y = sc.nextInt();
		int total = 0;
			if(x < y) {
				for (int i = x; i <= y ; i++) {
					total += i;
				}System.out.printf("%d부터 %d까지의 합: %d ",x, y, total);
				
			}else {
				for (int i = y; i <= x ; i++) {
				total += i;
			}System.out.printf("%d부터 %d까지의 합: %d ",y ,x , total);
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}// class
