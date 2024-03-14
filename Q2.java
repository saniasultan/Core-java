package ConditionalStatments;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to find to entered numbers are equal or not?
		System.out.println("enter two numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a==b) {
			System.out.println(a+" and "+b+" are qual");
			
		}
		else
			if(a>b) {
				System.out.println(a+" is greater");
				
			}else
				
			System.out.println(b+" is greater");
	}

}
