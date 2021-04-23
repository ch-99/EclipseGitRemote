package Example01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("d:/abc.txt");
			out = new FileOutputStream("d:/xyz.txt");
			
			byte[] buf = new byte[10];
			int len = -1;
			
			
			while((len = in.read(buf)) != -1) {
				out.write(buf,0,len);				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) out.close();
				if(out != null) in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
