package Loops;

import java.util.Scanner;

public class Qn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the factorial of entered number.
		System.out.println("enter one number");
		Scanner s=new Scanner(System.in);
		byte no=s.nextByte();
		int fact=1;
		for(byte i=1;i<=no;i++) {
			fact= fact*i;
			
		}
		System.out.println(fact);
	}

}
