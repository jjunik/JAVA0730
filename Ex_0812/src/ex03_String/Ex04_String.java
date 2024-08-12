package ex03_String;

import java.util.Scanner;

	public class Ex04_String {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("주민번호 입력 : ");
			String idNum = sc.next();
			if(idNum.length() > 14 || idNum.charAt(6) != '-') {
				System.out.println("주민번호를 올바르게 입력하세요");
			}else {
				String year = "";
				String result = "";
				year = idNum.substring(0,2);
				if(Integer.parseInt(year) <= 14	) {
					result = "당신은 20";
				}else {
					result = "당신은 19";
				}
				result += year + "년 " + idNum.substring(2,4) + "월 " + 
						idNum.substring(4,6) + "일에 태어난";
				if(idNum.charAt(7) % 2 != 0) {
					result += "남자입니다.";
				}else {
					result += "여자입니다.";
				}
				System.out.println(result);
			}
			
			
			
			
			
		}
	}

		
