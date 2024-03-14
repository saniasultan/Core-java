package ExceptionHandling;

import java.util.Scanner;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String str=s.nextLine();
System.out.println("str="+str);
try {
	System.out.println("char at="+str.charAt(0));
}
catch(Exception e) {
	System.out.println(e.getMessage());
}
try {
	String str2=null;
	System.out.println(str2.toLowerCase());
}catch(Exception e) {
	System.out.println(e.getMessage());
}

	}

}
