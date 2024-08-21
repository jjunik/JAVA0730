package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		 int[] arr = {4,1,2,10,7,9,5,6,3,8};
		 MethodTest mt = new MethodTest();
		 mt.maxFinder(arr);
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1. 섭씨를 화씨로 변경 2. 화씨를 섭씨로 변경");
		 int n = sc.nextInt();
		 switch(n){ 
		 case 1:
			 mt.fToc();
			 break;
		 
		 case 2:
			 mt.cTof();
			 break;
			 default :
				 System.out.println("잘못입력하셨습니다.");
				 break;
		}
	}
}
