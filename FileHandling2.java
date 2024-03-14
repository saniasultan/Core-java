package filehandaling;

import java.io.File;

public class FileHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt");
			if(f.exists()) {
				System.out.println(f.getName());
				System.out.println(f.getAbsolutePath());
				System.out.println(f.canWrite());
				System.out.println(f.canRead());
				System.out.println(f.length());
			//System.out.println(f.delete());
			
			}
			else {
				System.out.println("file doesnt exist");
			}
			
	}
		catch(Exception e) {
			
		}
	}
}
