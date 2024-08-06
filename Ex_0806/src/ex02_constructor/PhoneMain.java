package ex02_constructor;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 24, "흰색");// 인자를 세 개 넣으면 매개변수 세 개 짜리 생성자가 실행 됨
		Phone p2 = new Phone("아이폰", 15); // 인자를 두 개 넣으면 매개변수 두 개 짜리 생성자가 실행 됨
		p1.phoneInfo();
	}
}
