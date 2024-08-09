package ex02_inner;

class Calculator{
	private int val1;
	private int val2;
	
	// 객체를 만들 때 한 번 밖에 쓸수없다
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	// 다시 다른값을 대입하고싶다면 setter 를 만들어주는것이 좋다
	public class Calc{
		public int add() {
			return val1 + val2;
		}
	}
}

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 11);
		// 인스턴스 클래스의 객체 생성
		Calculator.Calc c = cal.new Calc();
		System.out.println("합 : " + c.add());
	}
}
