package basicprograms;

import java.util.Scanner;

public class Positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter one number");
		byte no=s.nextByte();
		if(no>=1)
			System.out.println("number is positive");
		
		else {
			System.out.println("number is negative ");
		}
	}

}
