package ConditionalStatments;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the entered number is positive or negative.
		System.out.println("enter one numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a>0) {
			System.out.println(a+" is positive");
		}
		else 
			System.out.println(a+" is negative");
	}

}
