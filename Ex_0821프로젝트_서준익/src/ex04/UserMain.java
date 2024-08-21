package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		
		outer : while(true) {
			System.out.print("아이디 생성 : ");
			UserInfo u = new UserInfo();
			u.setId(sc.next());
			
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId().equals(u.getId())) {
					System.out.println("아이디가 중복됩니다.");
					continue outer;
			}
			}
				
			System.out.print("비밀번호 설정 : ");
			u.setPwd(sc.nextInt());
			list.add(u);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId());
				System.out.println(list.get(i).getPwd());
				System.out.println("-------------------------------------");
			}
			

				
			
			
			
			
		}
	}
	
	
	
	
	
	
	
}
