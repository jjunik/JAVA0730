package ex02_thread;

import java.util.Scanner;

class ThreadCount extends Thread{
	private int sum;
	
	public ThreadCount(int sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				if (sum > 0) {
					Thread.sleep(1000);
					System.out.println(sum -= 1);
				}else {
					System.out.println("종료");
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//		for (int i = num; i == 0 ; i--) {
//			try {
//				Thread.sleep(1000);
//				System.out.println(sum);
//			} catch (Exception e) {
//				e.getStackTrace();
//				// TODO: handle exception
//			}
//		}System.out.println("종료");
	}
}


public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}
}
