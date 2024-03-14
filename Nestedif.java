package basicprograms;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
System.out.println("enter two number");
byte no1=s.nextByte();
byte no2=s.nextByte();
if(no1!=no2) {
	if(no1>no2) {
		System.out.println(no1+" no 1 is greater then"+no2);
		
	}
	else {
		System.out.println(no2+" is greater then "+no1);
	}
}
else {
	System.out.println("both values are same");
}
	
	
	
	}

}
