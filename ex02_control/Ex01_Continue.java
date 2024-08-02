package ex02_control;

import java.util.Iterator;

public class Ex01_Continue {
	public static void main(String[] args) {
		// continue
		// 반복문 안에서 continue를 만나게되면 이후의 코드는 수행 x
		// 반복문의 처음으로 돌아가 진행, for문의 경우 증감식으로 이동하며
		// while과 do-while의 경우 조건식으로 이동한다.
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}// if end
			sum += 1;
		}// for end
		System.out.println("홀수의 합: " + sum);
	}// main end
}// class end
