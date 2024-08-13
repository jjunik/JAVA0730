package ex02_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		// ArrayList 의 데이터 얻기
		List<Integer> list = new ArrayList<>();
		
		// 1~30 사이의 난수 10개를 list에 추가
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(ran.nextInt(30)+1);
		}
		// 짝수만 출력
		System.out.print("짝수 : ");
		for(int i = 0; i < list.size(); i++) {
			// List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if(value % 2 == 0) {
				System.out.print(value + " ");
			}
		}
		
		// 향상된 for문으로 전체 출력
		for(int value : list) {
			System.out.print(" 값 : " + value);
		}
		
	}
}
