package ex01_Buffured;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class Ex07_sum {
	public static void main(String[] args) throws Exception{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 할 숫자 수 입력 : ");
		int inNum = Integer.parseInt(buffer.readLine());
		System.out.print(inNum + "개의 정수 입력 : ");
		String[] iArr = buffer.readLine().split("");
		
		int total = 0;
		for (int i = 0; i < inNum; i++) {
			total += Integer.parseInt(iArr[i]);
		}System.out.println("입력한 정수들의 합 : " + total);
		
	}
}
