package ex02_for;

public class Ex02_For {
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print((j+1) + " ");
			}System.out.println();
		}
		int a = 0;
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 1; j < 5; j++) {
				++a ;
				System.out.printf("%02d ", a);
			}System.out.println();
		}
		System.out.println("-----------------------------------------------------------------");
		
		char ch = 'A';
		for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 4; j2++) {
				System.out.print(ch++ + " ");
			}System.out.println();
		}
		System.out.println("-----------------------------------------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("-----------------------------------------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				int num = i + j;
	             if(num > 10){
		            num -= 10;
	             }
				System.out.print(num + " ");
			}System.out.println();
			
			}
			
		
		
		
		
		
		
		
		
		
		
		
		


	}// main
}// class
