package Loops;

import java.util.Scanner;

public class Qn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the values between two entered number.
		System.out.println("Enter two numbers");
		Scanner s=new Scanner(System.in);
		byte i=s.nextByte();
		byte j=s.nextByte();
		for(byte m=i;m<=j;m++) {
			System.out.println(m);
		}
	}

}
