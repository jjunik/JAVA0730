package ex03_method;

public class BreadMain {
	public static void main(String[] args) {
		Bread bread = new Bread();
		bread.makeBread();
		bread.makeBread(5);
		bread.makeBread("피자", 3);
	}
}
