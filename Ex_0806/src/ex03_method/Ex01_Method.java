package ex03_method;
class Methodtest{
	public void result() {
		System.out.println("인자가 없는 메서드");
}
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	public void result(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	public void result(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
}
//-------------------------------------------------------------------------
public class Ex01_Method {
	public static void main(String[] args) {
		Methodtest mt = new Methodtest();
		mt.result();
		mt.result(2);
		mt.result('c');
		mt.result("홍", 2);
		mt.result(2, "헝");
}
}
