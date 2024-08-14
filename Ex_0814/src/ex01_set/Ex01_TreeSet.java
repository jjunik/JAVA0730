package ex01_set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex01_TreeSet {
	public static void main(String[] args) {
		// TreeSet 객체 생성
		TreeSet<Integer> set1 = new TreeSet<>();
		// set1의 모든 값을 가진 TreeSet 객체 생성
		TreeSet<Integer> set2 = new TreeSet<>(set1);
		// 초기값을 가지고 만들어지는 TreeSet 객체
		TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1,2,3));
		
		TreeSet<Integer> set = new TreeSet<>();
		
		//TreeSet에 값 추가하기
		set.add(7);
		set.add(4);
		set.add(9);
		set.add(1);
		set.add(5);
		System.out.println(set);
		// TreeSet에 값 삭제하기
		set.remove(1);
		System.out.println(set);
		
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println(set4.size());
		
		System.out.println(set4);
		System.out.println(set4.first()); // 최소값
		System.out.println(set4.last()); // 최대값
		System.out.println(set4.higher(3)); // 인자로 전달된 값보다 큰 값 중 최소값 출력 없으면 null
		System.out.println(set4.lower(3)); // 인자로 전달된 값보다 작은 값중 최대값 출력 //
		
		// index 가 없기 때문에 요소를 하나씩 꺼낼 수 가 없다.
		// 단 Iterator 를 사용하면 하나씩 꺼낼 수 있다
		
		Iterator<Integer> iter = set4.iterator();
		// hasNext() -> 다음에 순회할 요소가 있으면 true 아니면 false
		while(iter.hasNext()) {
			// 다음 요소를 반환한다.
			int val = iter.next();
			System.out.print(val + " ");
		}
		
	}
}
