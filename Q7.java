package Loops;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the table of entered number
		System.out.println("Enter one number");
		Scanner s=new Scanner(System.in);
		byte no=s.nextByte();
		for(byte i=1;i<=10;i++) {
			System.out.println(no*i);	
		}
	}

}
