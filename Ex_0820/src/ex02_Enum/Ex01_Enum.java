package ex02_Enum;

import java.util.Arrays;

public class Ex01_Enum {
	public static void main(String[] args) {
		// values() -> 열거형 상수안에 들어이있는 내용들을 enum 타입의 배열로 반환
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		// name() : 열거 객체가 가지고 있는 문자열을 반환
		// ordinal() : 열거 타입을을 정의할 때 주어진 순번을 반환
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		// valueOf() : 매개변수로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 반환
		Item i1 = Item.valueOf("START");
		System.out.println(i1);
		Item i2 = Item.START;
		System.out.println(i2);
		Item i3 = Item.STOP;
		// 열거형의 상수간의 비교는 == 을 사용을 한다. (상수끼리의 주소를 비교)
		System.out.println(i1 == i2);
		
		// 초과, 미만, 이상, 이하 와 같은 비교연산자는 사용할 수 없다.
		// 기준객체.compareTo(비교객체);
		// 매개값으로 주어진 객체를 비교해서 순번 차이를 반환
		// 기준 객체가 비교 객체보다 순번이 빠르면 -> 음수반환
		// 기준 객체가 비교 객체보다 순번이 늦다 -> 양수반환
		
		System.out.println(i1.compareTo(i3));
		
		
		switch(i1) {
		// Item.START 라고 쓸 수 없다
		case START -> System.out.println("게임시작!");
			
		case STOP -> System.out.println("일시정지");
		
		case EXIT -> System.out.println("게임종료!");
		}
		
		// 생성자가 private 이기 때문에 열거형 객체를 직접 만드는것은 불가능하다.
		Season s = Season.SUMMER;
		System.out.println(s.name());
		System.out.println("계절명 : " + s.getSeason() + "(" + s.getE_season() + ")");
		System.out.println(s.getE_season());
		
	}
}
