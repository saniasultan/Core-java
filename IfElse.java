package basicprograms;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take input from user and print its in the range of 10 to 15
		Scanner s=new Scanner(System.in);
		System.out.println("enter one number");
		byte no=s.nextByte();
		if(no>=10&&no<=15)
			System.out.println("number is in between 10 to 15");
		else {
			System.out.println("number is not in between 10 to 15 ");
		}
	}

}
