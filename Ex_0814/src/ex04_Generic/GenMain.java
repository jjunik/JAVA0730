package ex04_Generic;
class Gen <T>{
//	private T[] array;
	public<T> void printArr(T[] arr) {
		for(T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
public class GenMain {
	public static void main(String[] args) {
		
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		Gen g = new Gen();
		
		// 제네릭메서드 사용시 장점
		// 객체를 매 타입에 맞게 만들어 줄 필요가 없음
		g.printArr(iArr);
		g.printArr(dArr);
		g.printArr(cArr);
		
	}
}