package Loops;

import java.util.Scanner;

public class Qn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find entered number is prime or not
		Scanner s=new Scanner(System.in);
		System.out.println("enter one value");
		byte no=s.nextByte();
		byte i;
		for(i=2;i<=no-1;i++) {
			if(no%i==0) {
				System.out.println("not prime");
				break;
			}
		}
		if(no==i)
			System.out.println("prime");
	}

}
