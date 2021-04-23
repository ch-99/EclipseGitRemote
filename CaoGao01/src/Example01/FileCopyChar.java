package Example01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopyChar {
		
	public static void main(String[] args) {
		Reader  reader  = null;
		Writer  writer  = null;
		
		try {
			reader  =new   FileReader("d:/说明.txt");
			writer  = new   FileWriter("d:/介绍.txt");
			
			char[] buf = new char[4];
			StringBuffer str = new StringBuffer();
			
			int len = -1;
			while ((len = reader.read(buf)) != -1) {
				str.append(buf,0,len);	
			}
			System.out.println(str);
			
			String content = str.toString();
			content = content.replace("{name}", "陈豪").replace("{age}", "22");
			
			System.out.println(content);
			
			writer.write(content);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
