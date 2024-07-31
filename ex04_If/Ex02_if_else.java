package ex04_If;

public class Ex02_if_else {
	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num + "은 4보다 큽니다");
		}else {
			System.out.println(num + "은 4보다 작습니다");
		}
		//-------------------------------------------------
		int a = 4;
		int b = 10;
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		}else {
			if( a == b) {
			System.out.println("a는 b와 같습니다.");
		}else {
			System.out.println("a는 b보다 작습니다.");
		}
	}
		System.out.println("-------------------------------------------------");
		int x = 12;
		if(x > 10 && x <20) {
			System.out.println("true");
		}System.out.println("false");
		
		char ch = 'x';
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}System.out.println("false");
			
		char ch2 = 66;
		if(ch2 >= 65 && ch2 <= 122) {
			System.out.println("true");
		}System.out.println("false");
		
		
}	// main end
}	// class end