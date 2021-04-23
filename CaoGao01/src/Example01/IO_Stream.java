package Example01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IO_Stream {
	
	public static void main(String[] args) {
		
		InputStream in = null;
		

		try {
			in = new FileInputStream("d:/abc.txt");
			
//			InputStream in = new FileInputStream(new File("d:/abc.txt"));
			
			
			System.out.println("流的大小"+in.available());
			
			byte[] buf = new byte[1024];
			
			in.read(buf);
			
			
			in.read(buf);
			
			System.out.println(new String(buf));
			
			System.out.println("--------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
		
	}

}
