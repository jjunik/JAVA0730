package ex03_method;

public class MidTermMain {
	public static void main(String[] args) {
		MidTerm stu1 = new MidTerm()	;
		int[] scores1 = {80, 75};
		System.out.println("stu1 학생의 총 점수: " + stu1.score1(scores1));
		
		
		int[] scores2 = {90, 85};
		System.out.println("stu2 학생의 총 점수: " + stu1.score1(scores1));
		
		if(stu1.score1(scores1) > stu1.score1(scores2)) {
			System.out.println("stu1 학생의 점수가 더 높습니다.");
		}else if(stu1.score1(scores2) > stu1.score1(scores1)) {
			System.out.println("stu2 학생의 점수가 더 높습니다.");
		}else {
			System.out.println("성적이 같습니다.");
		}
	}
}
