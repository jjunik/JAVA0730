package ex01_interface;

public class ConverterMain {
	public static void main(String[] args) {
	// Converter 클래스를 상속받아 원화를 달러로 바꾸는
	// Won2Doller 클래스를 작성하시오
		// main 메서드의 실행 결과는 다음과같다
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
	
	}
}
