package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web0900_sji\\1.java/test.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				// 내용을 읽어와서 바이트배열 read에 저장
				fis.read(read);
				// 현재 byte[] 배열 read 에는 test.txt 에서 읽어온 데이터들이 저장되어있다.
				// 이를 문자열 형태로 재조립하여 출력할 수 있다.
				String res = new String(read);
				System.out.println(res);
			} catch (Exception e) {
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}// finally
		}// if
	}// main
}
