package Strings;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find the number of characters present in string without using len() 
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String");
		 String name = sc.nextLine();
		 int count=0;
		 for(char i:name.toCharArray())
		 {
		 count++;
		 }
		 System.out.println("Length: "+count);
	}

}
