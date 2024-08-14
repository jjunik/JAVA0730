package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex02_bingo {
	public static void main(String[] args) {
		// Collection.shuffle(list);
		// HashSet 과 ArrayList를 이용해 5*5 빙고판 만들기
		// 1 ~ 50 난수중 25개 넣기
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> hash = new HashSet<Integer>();
		Random r = new Random();
		
		while(true) {
			hash.add(r.nextInt(50)+1);
			if(hash.size() == 25) {
				break;
			}
		}
		
		Iterator<Integer> iter = hash.iterator();
		while(iter.hasNext()) {
			list.add(iter.next());
		}
		int count = 0;
		Collections.shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");	
			++count;
			if(count % 5 == 0 ) {
				System.out.println();
			}
		}
		
		
		
	}
}
