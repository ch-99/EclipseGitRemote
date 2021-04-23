package Example01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopyCharBuffered {
		
	public static void main(String[] args) {
		Reader  reader  = null;
		Writer  writer  = null;
		BufferedReader  br = null;
		BufferedWriter  bw = null;
		
		try {
			reader  =new   FileReader("d:/说明.txt");
			writer  = new   FileWriter("d:/介绍.txt");
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			
			
			StringBuffer str = new StringBuffer();
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
					str.append(line);
			
			}
			System.out.println(str);
			
			String content = str.toString();
			content = content.replace("name", "陈豪").replace("age", "22");
			
			System.out.println(content);
			
			bw.write(content);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null) bw.close();
				if(br!=null) br.close();
				
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
