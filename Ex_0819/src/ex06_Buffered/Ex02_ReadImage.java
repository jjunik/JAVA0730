package ex06_Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		FileInputStream readFile = null;
		FileInputStream bisReadFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본 스트림으로 읽기 시작");
			readFile = new FileInputStream("D:\\web0900_sji\\1.java/wall.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int code = 0;
			while((code = readFile.read()) != -1) {
				
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println("소요시간 : " + time);
			System.out.println("기본 스트림으로 읽기 종료");
			
			System.out.println("------------------------------------------");
			
			bisReadFile = new FileInputStream("D:\\web0900_sji\\1.java/wall.jpg");
			bis = new BufferedInputStream(bisReadFile);
			
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작2");
			while(bis.read() != -1) {
				// 이미지 읽기
			}
			System.out.println("이미지 읽기 종료2");
			end = System.currentTimeMillis();
			double result = (double)((end - start) / 1000);
			
			System.out.println("소요시간 : " + result);
			System.out.println("보조 스트림으로 읽기 종료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis != null) {bis.close();}
				if(bisReadFile != null) {bisReadFile.close();}
				if(readFile != null) {readFile.close();}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			}
				
	}		
	}
		

