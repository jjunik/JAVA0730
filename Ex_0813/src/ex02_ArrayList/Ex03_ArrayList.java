package ex02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex03_ArrayList {
	public static void main(String[] args) {
	// ArrayList의 데이터 삭제
		List<Integer> list = new ArrayList<>();
		// 리스트에 2의 배수를 10개 넣어
		for (int i = 2; i <= 20; i+=2) {
			list.add(i);
		}
		System.out.println(list);
		
		// 3번째 인덱스 내용 삭제
		list.remove(3);
		System.out.println(list);
		
		// 객체를 통한 삭제
		list.remove(Integer.valueOf(10));
		System.out.println(list);
		
		// 전체 삭제
		// list.clear();  		 -> 반환값 없음
		// list.removeAll(list); // -> 삭제하고 논리형을 반환 true , false
		// System.out.println(list);
		
		if(!list.isEmpty()) {
			if(list.removeAll(list)) {
				System.out.println("장바구니가 비워졌습니다.");
			}
		}
		
	}
}
