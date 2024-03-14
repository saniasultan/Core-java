package basicprograms;

import java.util.Scanner;

public class NESTEDIF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter percentage");
float per=s.nextFloat();
if(per>=75&&per<=100) {
	System.out.println("distinction");
}
else if(per>=60&&per<=75) {
	System.out.println("first class");
}
else if(per>=50&&per<=60) {
	System.out.println("second class");
}
else if(per>=35&&per<=50) {
	System.out.println("pass");
}
else if(per<=35&&per>=0) {
	System.out.println("fail");
}
else {
	System.out.println("invalid input");
	
}

	}

}
