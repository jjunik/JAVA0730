package ex01_Buffured;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex05_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter osw = null;
		try {
			out = new FileOutputStream("D:\\web0900_sji\\1.java/out예제.txt");
			osw = new OutputStreamWriter(out, "UTF-8");
			System.out.println("파일 생성 시작");
			String[] strArray = {"OutputStreamWriter에 대해 배웁니다", "We are learning about OutputStreamWriter"};
			for(String str : strArray) {
				osw.write(str + "\n");
			}
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(osw != null) osw.close();
				if(out != null) out.close();
			}catch(Exception e) {
				
			}
		}
	}
}
