package ex02_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		while(true) {
			System.out.print("id : ");
			String id = sc.next();
			System.out.print("pw : ");
			int pw = sc.nextInt();
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
				
			}else {
				if(!map.containsKey(id)) {
					System.out.println("아이디가 존재하지 않습니다.");
			}else{
				System.out.println("로그인 성공!");
				break;
			}
				
			}
		}
		
	}
}
