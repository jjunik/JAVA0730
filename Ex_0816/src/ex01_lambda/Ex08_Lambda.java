package ex01_lambda;
@FunctionalInterface
interface IAdd{
	int add(int x, int y);
	
}
class MathUtils{
	public static int AddElement(int x, int y) {
		return x + y;
	}
}
public class Ex08_Lambda {
	public static void main(String[] args) {
//		IAdd addLambda = (x,y) -> MathUtils.AddElement(x, y);
		IAdd addLambda = MathUtils::AddElement;
		System.out.println(addLambda.add(10, 20));
	}
}
