package ex03_array;

import java.util.Arrays;

public class Ex08_Multi_Array {
	public static void main(String[] args) {
		// 다차원 배열
		// 2차원 이상의 배열을 의미하며, 배열의 요소로
		// 또 다른 배열을 가지는것을 의미합니다.
		// 2차원 배열은 배열의 요소로 1차원 배열을 가지고,
		// 3차원 배열은 배열의 요소로 2차원 배열을 갖는다.
		
		// 2차원 배열의 생성
		int [] arr = new int[4]; // 1차원 배열
		// 자료형 [][] 배열명 = new 자료형 [크기][크기];
		
		int [][] arr2 = new int[3][2];
		
		arr2[0][0] = 100;
		arr2[0][1] = 200;
		arr2[1][0] = 300;
		arr2[1][1] = 400;
		arr2[2][0] = 500;
		arr2[2][1] = 600;
		
		System.out.println(Arrays.deepToString(arr2));
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 이차원배열 iArr에 있는 총합 구하기
		int [][] iArr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
	}
}
