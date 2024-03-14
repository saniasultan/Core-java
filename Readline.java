package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Readline {

	public static void main(String[] args) throws IOException {
	
// TODO Auto-generated method stub
		InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter your name");
String name=br.readLine();
System.out.println("name="+name);
System.out.println("enter your age:");
int age=Integer.parseInt(br.readLine());
System.out.println("age="+age);
}

}
