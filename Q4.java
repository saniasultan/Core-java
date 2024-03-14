package ConditionalStatments;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the entered number is even or odd
		System.out.println("enter one numbers");
		Scanner s=new Scanner(System.in);
		byte a=s.nextByte();
		if(a%2==0) {
			System.out.println(a+" is even");
		}
		else
			System.out.println(a+" is odd");
	}

}
