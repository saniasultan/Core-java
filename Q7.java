package ConditionalStatments;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to perform arithmetic operations between two integer values according to 
	//	the operator entered by user.
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int a=20,b=30;
		if(num==1) {
			System.out.println("addition="+(a+b));
		}
		if(num==2) {
			System.out.println("substraction="+(a-b));
		
		}
		if(num==3) {
			System.out.println("Multiplication="+(a*b));
		}
		
		else {
			if(num>3||num<0) {
			System.out.println("Wrong input");
			
		
			}
			}
	}

}
