package ex03_method;

public class Bread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("----------------------------");
	}
	
	public void makeBread(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("빵을 만들었습니다.");
		}System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", num);
		System.out.println("----------------------------");
	}
	
	public void makeBread(String name, int num) {
		for (int i = 0; i < num; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",name);
		}System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n", num, name);
	}
}
