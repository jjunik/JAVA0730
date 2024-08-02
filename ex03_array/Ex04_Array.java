package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// 10개의 정수를 담을 수 있는 배열의 생성
		// 배열의 이름은 numbers
		
		int[] numbers = new int[10];
		
		// 배열에 Random 클래스를 이용하여 1 ~ 30 사이의 난수 넣기
		// nextInt(30)+1;
		for (int i = 0; i <numbers.length; i++) {
			numbers[i] = random.nextInt(30)+1;
		}
		
		// 배열의 모든 요소 출력하기
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((numbers[i]) + " ");
		}System.out.println();
		
		// 배열 안에서 짝수의 합 구하기
		int total=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				total += numbers[i];
			}
		}System.out.println("짝수의 합: " + total);
		
		// 배열에서 영문자만 추출하여 이어붙혀 출력하기
		char[] cards = {'1', 'L', '2','O','2','V','E','3'};
		String myWord = "";
		
		
		for (int i = 0; i < cards.length; i++) {
			if(cards[i] >= 65 && cards[i] <= 90) {
				myWord += cards[i];
			}
		}System.out.print(myWord);
		
		System.out.println();
		// 배열 arr에 담겨있는 모든 값의 합을 구하세요
		int[] arr = {10, 20, 30, 40, 50};
		int total1 = 0;
		for (int i = 0; i < arr.length; i++) {
			total1 += arr[i];
		}System.out.println(total1);
		
//		System.out.print("정수 입력: ");
//		int a = sc.nextInt();
//		int[] arr2 = new int[a];
//		char alpha = 65;
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] += alpha;
//			alpha++;
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print((char)arr2[i]);
//		}
//		System.out.println();
		
		// 동전 개수 구하기
		// 10 ~ 5000 사이의 난수를 변수에 담는다
		// 1의 자리는 반드시 0이되어아함
		// 발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드
		// 가능한 적은 수의 동전을 사용
		int money = random.nextInt((500)+1)*10;
		int[] coin = {500, 100, 50, 10};
		int[] coinCount = new int[4];
		
		System.out.println("금액 : " + money);
		for (int i = 0; i < coin.length; i++) {
			
			 int res = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], res);
		}
		System.out.println("--------------------------------------");
			// 로또번호 생성하기
		// 1~ 45 사이의 난수를 발생시켜 번호를 배열에 저장하고 출력하기
		
		int[] lotto = new int[6];
		System.out.print("로또 번호 : ");
		outer:for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}// if end
			}// for j
			System.out.print(lotto[i] + " ");
			
		}// for i

	}
}
