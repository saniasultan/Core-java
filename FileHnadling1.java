package filehandaling;

import java.io.File;

public class FileHnadling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File f=new File("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt");
	if(f.createNewFile()) {
		System.out.println("file created");
	}
	else
		System.out.println("file not created");
}
catch(Exception e) {
	
}
	}

}
