package ex03_veriable;

public class Ex_PrintData {
	public static void main(String[] args) {
		// 정수형 데이터 : 소수점이 없는 숫자 1, 24, 100, -50, -189 ...
		// 실수형 데이터 : 소수점이 있는 숫자 1.23, 3.14...
		// 문자형 데이터 : 홑따옴표로 감싼 한 글자 'a', 'b', 'c' ...
		// 문자열 데이터 : 쌍따옴표로 감싼 글자 "안녕하세요", "반갑습니다" ...
		
		System.out.println(100);
		System.out.println(100 + 50);
		
		// 문자열 앞 뒤에 오는 더하기는 연결의 의미를 가지고 있음
		System.out.println("안녕하세요" + 50);
		
		System.out.println(5 + 10 + ":" + 5 + 10);
		// 15:510
		System.out.println(5 + 10 + ":" + (5 + 10));
		// 15:15
		
		System.out.println("2 + 2 = " + 2 + 2);
		System.out.println("2 + 2 = " + (2 + 2));
		
		
		
		
	}
}
