package ex04_exception;

public class Ex03_Exception {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		// 배열에서 index 범위를 초과해 사용할 때 발생한다.
		int[] arr = {1, 6, 7, 8 ,10};
		
		System.out.println(arr[6]);
	}
}
