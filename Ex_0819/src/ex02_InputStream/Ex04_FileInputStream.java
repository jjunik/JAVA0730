package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web0900_sji\\1.java/file.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()]; 
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(read);
				String res = new String(read);
				for (int i = 0; i < res.length() / 2; i++) {
					if(res.charAt(i) == res.charAt(res.length()-i-1)) {
						System.out.println(res + "는 회문");
					}else {
						System.out.println(res + "는 회문아님");
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
		
	}
}
