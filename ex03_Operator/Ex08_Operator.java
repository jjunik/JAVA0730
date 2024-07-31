package ex03_Operator;

import java.util.Scanner;

public class Ex08_Operator {
	public static void main(String[] args) {
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		// 1.
		int day = pear + apple + orange;
		System.out.println("하루 생산량 : " + day);
		
		// 2.
		double hour = (double)day / 24;
		System.out.println("시간당 생산량 : " + hour);
		//------------------------------------------------
		
		// 1. 
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공 개수 입력 : ");
		int ball = sc.nextInt();
		int n = 5;
		int box = (ball % n) >= 1 ? ball / n + 1 : ball / n;
		System.out.println("필요한 상자의 개수 : " + box);

		// ----------------------------------------------------
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int math = sc.nextInt();
		
		// 1.
		int total = kor + eng + math;
		System.out.println("세 과목의 합 : " + total);
		// 2.
		double avg = total / 3.0;
		System.out.println("세 과목의 평균 : " + avg);
		// 3.
		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println("합격여부 : " + result);
		
		
	}
}
