package ex01_interface;



public class Main {
	public static void main(String[] args) {
		// point를 상속받아 색을 가진 점을 나타내는 ColorPoint클래스 작성
		// 메인메서드 실행한 결과
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setXY(10,20);
		cp.setColor("Red");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		// 결과
		// Red색의 (10,20)의 점 입니다.
	}
}
