package Example01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OUT_Stream {
	
	
	
	public static void main(String[] args) {
		OutputStream  out = null;
		
		
		try {
			out = new FileOutputStream("d:/ch1.txt");
			
			byte[] buf = new byte[1024];
			
			
			
			out.write("123456ssss".getBytes());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
