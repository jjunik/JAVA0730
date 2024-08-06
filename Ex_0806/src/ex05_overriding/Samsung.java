package ex05_overriding;

public class Samsung extends Computer{
	@Override
	void powerOn() {
		// 오버라이드		오버로드
		// 재정의			중복정의
		
		// 같은 메서드지만 자식클래스의 상황에 맞게 재정의 하는 것.
		System.out.println("I LOVE SAMSUNG");
	}
}
