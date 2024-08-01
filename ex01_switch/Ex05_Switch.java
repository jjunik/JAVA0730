package ex01_switch;

import java.util.Scanner;
public class Ex05_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt()	;
//		int result = num % 2;
//		switch(result) {
//		case 1 :
//			System.out.println("홀수입니다.");
//			break;
//		case 0 :
//			System.out.println("짝수입니다");
//			break;
//		}
//		
//		switch(num) {
//		case 1, 3, 5, 7, 9 -> System.out.println("홀수입니다.");
//		case 2, 4, 6, 8, 10 -> System.out.println("짝수입니다.");
//		default -> System.out.println("10 이하의 정수로 다시 입력하세요");
//		}
//		
//		System.out.print("month 입력: ");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + "월은 31일까지 있습니다.");
//		case 4, 6, 9, 11 -> System.out.println(month + "월은 30일 까지 있습니다.");
//		case 2 -> System.out.println(month + "월은 29일 까지 있습니다.");
//		default -> System.out.println("다시 입력하세요");
//		}
//		
		//----------------------------------------------------------------------------------------
		System.out.println("사칙연산 프로그램");
		System.out.print("첫 번째 정수 x 입력: ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수 y 입력: ");
		int y = sc.nextInt();
		System.out.print("연산기호 입력: ");
		String str = sc.next();
//		int result;
//		switch(str) {
//		case "+" :
//			result = x + y;
//		System.out.printf("%d %s %d = %d", x, str, y, result);
//		break;
//		case "-" :
//			result = x - y;
//		System.out.printf("%d %s %d = %d", x, str, y, result);
//		break;
//		case "*" :
//			result = x * y;
//		System.out.printf("%d %s %d = %d", x, str, y, result);
//		break;
//		case "/" :
//			result = x / y;
//		System.out.printf("%d %s %d = %d", x, str, y, result);
//		break;
//		default :
//			System.out.println("다시 입력하세요.");
//		}
		
		switch(str) {
		case "+" -> System.out.printf("%d %s %d = %d", x, str, y, (x+y));
		case "-" -> System.out.printf("%d %s %d = %d", x, str, y, (x-y));
		case "*" -> System.out.printf("%d %s %d = %d", x, str, y, (x*y));
		case "/" -> System.out.printf("%d %s %d = %f", x, str, y, (x/y)); //(double)
		default -> System.out.println("다시 입력하세요");
		}
		
	}
}
