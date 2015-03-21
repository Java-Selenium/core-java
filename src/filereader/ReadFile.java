package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\rrt\\Desktop\\java-class\\sample.txt";
		FileReader file = null;
		BufferedReader br = null;
		
		try {
			
			file = new FileReader(filePath);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		br = new BufferedReader(file);
		
		String st = "";
		try {
			while((st = br.readLine())!=null){
				
				System.out.println(st);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally{
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
