package ex01_getterSetter;

public class Person {
	// 필드에 직접 접근하지 못하도록 private 으로 범위를 제한
	private int age;
	public void setAge(int num) {
		if(num < 0) {
			System.out.println("1 이상의 값으로 설정하세요.");
			return; // 메서드 종료
		}
		age = num; // age 필드에 num 값을 대입
	}
	// 메서드가 public 이면 외부에서 사용 가능
		public int getAge()	{
			return age;
		}
	
}
