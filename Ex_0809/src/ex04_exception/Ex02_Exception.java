package ex04_exception;

public class Ex02_Exception {
	public static void main(String[] args) {
	// NumberFormatException
		// 잘못된 문자열을 정수로 변환하려고 할 때 발생
		// 숫자형태 "111"은 정수로 변환할 수 있지만
		// "11.11"은 변호나 할 수 없다.
		
		String str1 = "11";
		String str2 = "11.2";
		int num01 = Integer.parseInt(str1);
		System.out.println("String to int : " + num01);
		
		int num02 = Integer.parseInt(str2);
		System.out.println("String to int : " + num02);
}
}
