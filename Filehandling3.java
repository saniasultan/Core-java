package filehandaling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Filehandling3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		try {
			File f1=new File("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt");
			Scanner s=new Scanner(System.in);
			FileWriter f=new FileWriter("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt",true);
			
			try {
			System.out.println("enter text");
			String str=s.nextLine();
		f.write(" "+str);
		}
			finally {
			
				f.close();
			}
			System.out.println("Length="+f1.length());
			System.out.println("write done");
	}catch(Exception e) {}
		
	
		
		
	}

}
