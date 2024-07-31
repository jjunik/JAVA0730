package ex02_Scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//		System.out.printf("제 나이는 %d살 입니다.\n", age);

		System.out.println("------------------------------------");
		// 제 이름은 ~~~입니다
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		// 제 나이는 ~~살 입니다
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
	
		// 제 주소는 ~~~입니다
		System.out.print("주소를 입력하세요: ");
		String adress = sc.nextLine();
		
		// 제 키는 xx.xxcm입니다 
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.printf("제 나이는 %d살 입니다.\n"
				+ "제 이름은 %s 입니다\n"
				+ "제 주소는 %s 입니다\n"
				+ "제 키는 %.2f 입니다\n", age,name,adress,height);
	}
}