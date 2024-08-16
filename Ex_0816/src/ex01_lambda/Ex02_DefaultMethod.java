package ex01_lambda;

interface Interface{
	//추상메서드
	 abstract void methodA();
	 abstract void methodB();
	 abstract void methodC();
	// 메서드 앞에 default 예약어를 붙힌다
	 // 2. body(구현부)가 있어야한다.
	 default void defaultMethodA() {
		 System.out.println("디폴트 메서드 A");
	 }
}

class InterImpl implements Interface{
	// 안 쓴다고 할지라도 일단 인터페이스의 모든 추상메서드를 오버라이딩 해야 한다.
	@Override
	public void methodA() {
		System.out.println("오버라이딩 된 메소드A");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Ex02_DefaultMethod {
	public static void main(String[] args) {
		Interface inter = new InterImpl();
		inter.defaultMethodA();
		inter.methodA();
		
	}
}
