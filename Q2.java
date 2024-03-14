package Strings;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print every third character of entered string.
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String");
		 String name = sc.next();
		 char third=name.charAt(2);
		 System.out.println("Character at 3rd Place : "+third);
	}

}
