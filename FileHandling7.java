package filehandaling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHandling7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
FileReader reader=new FileReader("UserData.properties");
Properties p=new Properties();
try {
	p.load(reader);
	String uname=p.getProperty("UserName");
	System.out.println("username="+uname);
	System.out.println("password="+p.getProperty("Password"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
