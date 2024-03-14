package Loops;

import java.util.Scanner;

public class Qn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print values from 1 to entered number
		System.out.println("enter one number");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		for(int i=1;i<=no;i++) {
			System.out.println(i);
		}
	}

}
