package ex05_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("정수 입력 : ");
		try {
			str = sc.next();
			
			int n = Integer.parseInt(str);	
						System.out.println("입력받은 수 : " + n);
		} catch (Exception e) {
			System.out.println(str + "는(은) 정수가 아닙니다.");
		}
	}
}
