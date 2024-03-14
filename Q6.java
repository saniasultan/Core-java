package ConditionalStatments;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the days of the week according to the entered day number.
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num==1) {
			System.out.println("day is monday");
		}
		if(num==2) {
			System.out.println("day is tuesday");
		
		}
		if(num==3) {
			System.out.println("day is wed");
		}
		if(num==4) {
			System.out.println("day is thursday");
		}
		if(num==5) {
			System.out.println("day is friday");
		}
		if(num==6) {
			System.out.println("day is saturday");
		}
		if(num==7) {
			System.out.println("day is sunday");
		}
		else {
			if(num>7||num<0) {
			System.out.println("Wrong input");
			
		
			}
		
		}
	}

}
