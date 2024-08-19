package ex01_File;

import java.io.File;

public class Ex03_File {
	public static void main(String[] args) {
		// aaa / bbb 의 경우 실제 있는 경로가 아님
		String path = "D:\\web0900_sji\\1.java/aaa/bbb";
		
		File f = new File(path);
		
		// 최종목적지가 파일이든 폴더든간에 아예 존재하지가 않음
		// exists -> 최종목적지 까지 가는 길에 없으면 false 있으면 true
		if(!f.exists()) {
			System.out.println("폴더생성");
			f.mkdirs(); // 복수의 폴더를 만들어주는 메서드
		}
	}
	// 파일클래스의 세번째 기능
	// 목적지 까지 경로가 존재하는지 파악가능
	// 폴더를 만드는것이 가능하다.
	// 특정 문서를 만드는 기능은 없다.
	
	// 파일 클래스의 역할
	// 경로의 검증( 존재하냐 존재하지 않냐, 파일인지 폴더인지 검증, 파일이름 가져오기)
	
}
