package ex02_object;

public class CarMain {
	public static void main(String[] args) {
		Ex02_Car car = new Ex02_Car("소나타"	,"현대"	);
		System.out.println(car); // car.toString 과 동일
		
		System.out.println("차 이름 : " + car.getCarName());
		System.out.println("브랜드 : " + car.getCompany());
	}
}
