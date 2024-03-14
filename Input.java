package basicprograms;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
System.out.println("enter your name,age and percentage");
///doesnt take when you give input with space eg = abc def it will not take def 
String name=s.nextLine();//it will take the input which is given after space also

byte age=s.nextByte();
float percentage=s.nextFloat();
boolean cond=s.nextBoolean();
char ch=s.next().charAt(0);
System.out.println("name="+name+"\tage="+age+"\tpercentage="+percentage+"\tcond="+cond+"\tch="+ch);


	}

}
