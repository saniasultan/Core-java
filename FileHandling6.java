package filehandaling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHandling6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
FileOutputStream fout=new FileOutputStream("C:\\Users\\sania\\OneDrive\\Desktop\\temp.txt",true);
BufferedOutputStream bout=new BufferedOutputStream(fout);
try {
	String s="Hi";
	byte[] b=s.getBytes()
;
	bout.write(b);
	System.out.println("write done!");
	bout.close();
	fout.close();
	
	}
catch(Exception e) {
	
}
	}

}
