package ex03_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select;
		Person p = null;
		boolean sys = true;
		ArrayList<Person> personArr = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		while(sys) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("항목선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				p = new Person();
				System.out.println("-----정보 추가-----");
				System.out.print("이름 : ");
				p.setName(sc.next());
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				System.out.print("전화 : ");
				p.setNumber(sc.next());
				
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				System.out.println("------------------------------");
				break;
			case 2:
				System.out.println("-----정보 삭제-----");
				System.out.print("삭제 할 이름 입력 : ");
				String name = sc.next();
				for(int i = 0; i < personArr.size(); i++) {
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
						System.out.println(name + " 의 정보를 삭제했습니다.");
						break;
					}else {// list에 저장된 사람이 존재할 때
						if(i + 1 == personArr.size()) {
							System.out.println(name + " 이 존재하지 않습니다.");
						}
						
					}
				}
				break;
			case 3:
				System.out.println("-----전체 정보-----");
				System.out.println("등록인원 : " + personArr.size() + "명");
				for (Person p1 : personArr) {
					System.out.println("이름 : " + p1.getName());
					System.out.println("나이 : " + p1.getAge());
					System.out.println("전화 : " + p1.getNumber());
				}System.out.println("------------------------------");
				break;
				
			case 4:
				System.out.println("프로그램 종료");
				sys = false;
				break;
			}
		}
	}
}
