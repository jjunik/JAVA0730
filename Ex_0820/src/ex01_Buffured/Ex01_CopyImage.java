package ex01_Buffured;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {
	public static void main(String[] args) {
		// 보조스트림을 이용해서 이미지를 복사 wallCopy3
		FileInputStream in = null;
		FileOutputStream out = null;
		BufferedInputStream bIn = null;
		BufferedOutputStream bOut = null;
		try {
			System.out.println("이미지 복사 시작");
			long start = System.currentTimeMillis();
			in = new FileInputStream("D:\\web0900_sji\\1.java/wall.jpg");
			bIn = new BufferedInputStream(in);
			out = new FileOutputStream("D:\\web0900_sji\\1.java/wall_copy3.jpg");
			bOut = new BufferedOutputStream(out);
			int read = 0;
			while((read = bIn.read()) != -1) {
				bOut.write(read);
			}
			System.out.println("이미지 복사 완료");
			long end = System.currentTimeMillis();
			double res = (double)(end - start) / 1000;
			System.out.println("걸린시간 : " + res); 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bOut != null) {bOut.close();}
				if(bIn != null) {bIn.close();}
				if(out != null) {out.close();}
				if(in != null) {in.close();}
			}catch (Exception e2){
				
			}
			
		}
	}
}
