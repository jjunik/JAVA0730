package ex01;

public class Ex02 {
	public static void main(String[] args) {
		int result = 0;
	int num = 1;
	int[] n = new int[20]; 
	for (int i = 0; i < n.length; i++) {
		n[i] = num++;
	}
	for (int i = 0; i < n.length; i++) {
		if(n[i] % 2 != 0 && n[i] % 3 != 0) {
			result += n[i];
		}
	}
	System.out.println(result);
//	n 
	}
}
