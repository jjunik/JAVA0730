package ex04_Reader;

import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) {
		int uCount = 0;
		int lCount = 0;
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\web0900_sji\\1.java/reader.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code > 64 && code <91) {
					uCount++;
				}else if(code > 96 && code < 123) {
					lCount++;
				}
				System.out.print((char)code);
				
			}
			System.out.println();
			System.out.println("대문자 : " + uCount);
			System.out.println("소문자 : " + lCount);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fr != null ) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
