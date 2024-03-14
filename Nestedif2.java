package basicprograms;

import java.util.Scanner;

public class Nestedif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter three number");
		byte a=s.nextByte();
		byte b =s.nextByte();
		byte c=s.nextByte();
if(a==b&&b==c)
	System.out.println("All values are same");
else {
	if(a>b) {
		
		if(a>c) 
			System.out.println(a+" is greater");
			else
				System.out.println(c +" is greater");
		}
		else {
			if(b>c)
				System.out.println(b+" is greater");
			else
				System.out.println(c +" is greater");
		}
	}
}
	}


