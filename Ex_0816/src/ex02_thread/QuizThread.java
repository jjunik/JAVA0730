package ex02_thread;

import java.util.Random;

public class QuizThread extends Thread{
	private int res;
	
	public QuizThread(int res) {
		this.res = res;
	}
	public void startGame() {
		
		 int count = 0;
		while(count == 5) {
			
				int ran1 = new Random().nextInt((100)+1);
				int ran2 = new Random().nextInt(100)+1;
	
				System.out.print(ran1 + " + " + ran2 + " = " + res);
				if(res == (ran1 + ran2)) {
					System.out.println("정답!");
					count++;
				}else {
					System.out.println("오답");
					continue;
				}
			}
		}
	
	@Override
	public void run() {
		System.currentTimeMillis();
	}
	
	}
	
	

