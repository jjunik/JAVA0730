package ex04_exception;

public class Ex01_Exception {
	public static void main(String[] args) {
		// 배열 변수만 만들고 생성하지않음
		String[] strArray = null;
		// 호출하려고 하니 에러 발생
		System.out.println(strArray[0]);
	}
}
