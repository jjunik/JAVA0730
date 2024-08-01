package ex01_switch;

public class Ex01_Switch {
	public static void main(String[] args) {
		int num = 7;
		
		//1. 비교값과 조건값의 타입은 일치해야한다.
		//2. 중복되는 조건값은 사용 x
	
		switch(num) {
		case 1:
			System.out.println("num은 1입니다");
			break;
		case 7:
			System.out.println("num은 7입니다");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다");
			break;
		}
		// if vs switch
//		둘 다 조건에 따라서 명령을 실행을 하는 문법이다.
//		if문은 범위에 따라서 조건을 비교하는데 효과적이고
//		switch문은 하나의 값에 따라서 조건을 비교하는데 효과적이다.
}
}
