package ex03_veriable;

public class Ex_Veriable02 {
	public static void main (String[] args) {
		
		// 논리형
		boolean b = true;
		System.out.println("b의 값 : " + b);
		
		b = false; // 다시 대입을 하면 원래 있던 값은 없어짐
		System.out.println("b의 값 : " + b);
		
		// b = 1; 자료형의 값이 올바르지 않아 오류 발생
		//---------------------------------------------------
		// 문자형
		char ch = 'A';
		System.out.println("ch의 값 : " + ch);
		ch = 66; // B (아스키코드)
		System.out.println("ch의 값 : " + ch);
		//---------------------------------------------------
		// 정수형
		// byte b1 = 128; (표현범위 -128~127을 벗어남) 
		byte b1 = 127;
		short s1 = 32767;
		int i = 550;
		
		System.out.println("b1 의 값 : " + b1);
		System.out.println("s1 의 값 : " + s1);
		System.out.println("i 의 값 : " + i);
		//----------------------------------------------------
		// 실수형
		// 자바에서 실수는 기본적으로 double 형으로 인식하기 때문에
		// float 자료형을 사용한다는 것을 명시해줘야 함
		
		float f = 3.14f;
		
		// 내가 만드려는 변수의 타입이 어차피 같다면 한번에
		// 여러개를 선언하는 것도 가능
		
		float f1 = 3.15f, f2 = 3.14f;
		System.out.println(f1 + "+" + f2);
		
		// 변수를 이용해 다른 변수에 값 복사하기
		int myAge = 20;
		int yourAge = myAge;
		System.out.println("내 나이 : " + myAge);
		System.out.println("친구 나이 : " + yourAge);
		
		//-----------------------------------------------------
		// 두 변수에 들어있는 값을 바꾸려면 어떻게 해야할까?
		int su1 = 20, su2 = 30;
		System.out.println("변경 전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		// 내용물을 임시로 담아놓을 컵이 필요
		int temp = su1; // temp 에 20이 대입
		su1 = su2; // su1에 30
		su2 = temp; // su2에 20
		System.out.println("변경 후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
	}
}
