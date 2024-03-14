package ConditionalStatments;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find greater number between two entered numbers.
		System.out.println("enter two numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else
			System.out.println(b+" is greater");
	}

}
