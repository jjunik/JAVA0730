package ex05_Iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_Iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iter = list.iterator();
		
		int count = 0;
		
		// 향상된 for 문을 기반으로 한다.
		// 처음 부터 끝날 때 까지 작동
		while(iter.hasNext()) {
			int value = iter.next();
			System.out.printf("list 데이터 [%d] : %d\n",count++, value);
		}
		Set<Integer> set = new HashSet<Integer>()	;
		
		for (int i = 0; i <= 10; i++) {
			set.add(i);
		}
		count = 0;
		Iterator<Integer> iter2 = set.iterator();
		
		while(iter2.hasNext()) {
			int val = iter2.next();
			System.out.printf("set 데이터 [%d] : %d\n",count++, val);
		}
	}
}
