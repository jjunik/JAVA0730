package ex03_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {
		
	
	// 아이디 생성 : abc
	// abc
	// 아이디 생성 : abc2
	// abc abc2
	// 아이디 생성 : abc2
	// 중복된 아이디
	// 아이디 생성 : abc3
	// abc abc2 abc3
		
	// list의 요소의 개수가 4개이면 프로그램 종료
	Scanner sc = new Scanner(System.in);
	List<String> list = new ArrayList<>();
	boolean sysOff = true;

		while(sysOff) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			list.add(id);
			System.out.print(list);
			System.out.println();
			if(list.size() == 4) {
				break;
			}
		}System.out.println("프로그램 종료");
	}
}
