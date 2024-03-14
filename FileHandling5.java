package filehandaling;

import java.io.FileInputStream;

import java.io.IOException;

public class FileHandling5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt");
			try {
				int i;
				while((i=fin.read())!=-1) {
					System.out.println((char)i);
				}
				
			}catch(IOException e) {
				
			}
			finally {
				fin.close();
			}
			
			
		}
			catch (Exception e) {
			}
			
	}

}
