package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		CalPlus calp = new CalPlus();
		System.out.println("CalPlus : " + calp.getResult(25, 5));
		CalMinus calm = new CalMinus();
		System.out.println("CalMinus : " + calm.getResult(25, 10));
	}
}
