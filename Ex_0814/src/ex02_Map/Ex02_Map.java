package ex02_Map;

import java.util.HashMap;

public class Ex02_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		// map에 특정 key 값이 포함되어 있는지 확인하는 메서드
		// containsKey()
		if(map.containsKey("k3")) {
			System.out.println("k3 라는 key 가 존재합니다.");
		}
		// map에 특정 value 값이 포함되어있는지 확인하는 메서드
		// containsvalue()
		if(map.containsValue(3.14f)) {
			System.out.println("map에 3.14라는 value 가 존재합니다.");
		}
		
		
		
		
		
		
		
		
	}
}
