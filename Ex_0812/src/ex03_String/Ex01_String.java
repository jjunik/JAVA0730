package ex03_String;

public class Ex01_String {
	public static void main(String[] args) {
		String str = "Kim Mal Ddong";
		
		//문자열의 길이
		// length()
		System.out.println("문자열 str의 길이 : " + str.length());
		
		// 특정 문자의 위치
		// indexOf(char ch)
		System.out.println("문자 a의 위치 : " + str.indexOf('a'));
		
		// indexOf
		System.out.println("문장 Mal의 위치 : " + str.indexOf("Mal"));
		
		//lastIndexOf(char ch)
		System.out.println("마지막 문자 n의 위치: " + str.lastIndexOf('n')); 
		
		// 인덱스를 통해 문자 받아오기
		// charAt(int index)
		System.out.println("추출 한 문자 : " + str.charAt(4));
		
		// 특정 문자열만 잘라내기
		// substring(int start, int end)
		String str2 = str.substring(0, str.indexOf('M'));
		System.out.println("0번째부터 M앞자리까지 글자 잘라내기 : " + str2);
		System.out.println("잘라낸 str2의 길이 : " + str2.length());//길이는 띄어쓰기 포함 1부터 증가

//		스트링은 아니지만 스트링으로 작성된 숫자형태의 문자열을 실제 정수로 바꿔주는 코드
		String number = "1";
		System.out.println(Integer.parseInt(number) + 10);

		int number2 = 1;
		String s1 = Integer.toString(number2);
		System.out.println(s1);
				
		String arr[] = str.split(" ");//띄어쓰기를 기준으로 분할

		for(int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "] : " + arr[i]);
	}
}
