package Strings;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print your entered name in reverse order
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.next();

		StringBuffer sb=new StringBuffer(s);
		System.out.println("reverce=sania"+sb.reverse());
		
	}

}
