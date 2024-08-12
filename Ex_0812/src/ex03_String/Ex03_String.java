package ex03_String;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회문 입력 : ");
		String str = sc.next();
		
		String rev = "";
		for(int i = str.length(); i>0; i--  ) {
			rev += str.charAt(i - 1);
			
			if(rev.equals(rev)) {
				System.out.println(str + "은 회문입니다." );
			} else {
				System.out.println(str + "는  회문이 아닙니다.");
			}
		}
	}
}
