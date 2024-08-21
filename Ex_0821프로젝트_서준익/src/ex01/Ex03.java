package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		int r = new Random().nextInt((500)+1);
		r *= 10;
		int[] coin = {500, 100, 50, 10};
		
		System.out.println("금액 : " + r);
		int result = 0;
		for (int i = 0; i < coin.length; i++) {
			result = r / coin[i];
			System.out.println(coin[i] + "원 " + result + "개");
			 r %= coin[i];
		}
		
		
		
		
		
	}
}
