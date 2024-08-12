package ex03_String;

import java.util.Scanner;

public class Ex02_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("알파벳 입력 : ");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 개수 :"
				+ " " + count);
	}
}
