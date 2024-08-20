package ex02_Enum;

public class OperationMain {
	public static void main(String[] args) {
		double x = 2.5;
		double y = 5.0;
		Operation[] oper = Operation.values();
		for(Operation op : oper) {
			System.out.printf("%.1f %s %.1f = %.1f\n",x,op.getOp(),y, op.apply(x,y));
		}
	}
	
}
