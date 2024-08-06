package ex01_getterSetter;

public class PersonMain {
	public static void main(String[] args) {
		Person hong = new Person();
		hong.setAge(30); // age 필드에 30 대입
		
		System.out.println("hong의 나이는 " + hong.getAge() + "입니다.");
		
	}

}
