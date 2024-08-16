package ex02_thread;

public class MyThread extends Thread{
	public MyThread() {
		// Thread 클래스
		setName("myThread-1");
	}
	
	
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += (i+1);
		}System.out.println("sum : " + sum);
		String threadName = Thread.currentThread().getName();
		// 스레드에 별도의 이름을 지정해 주지 않으면 시스템에서 정의한다.
		System.out.println("현재 스레드 이름 : " + threadName);
		
	}

}
