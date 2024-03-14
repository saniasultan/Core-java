package filehandaling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHanlding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader f=new FileReader("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt");
		try {
			int i;
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			
		}
		finally {
			f.close();
		}
		
		
	}
		catch (Exception e) {
		}
		

}}
