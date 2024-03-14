package Strings;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find a character present in string or not?if present in which index it is present .and how 
		//many times it is present. 
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String");
		 String name = sc.nextLine();
		 System.out.println("Enter Character to Search");
		 char search = sc.next().charAt(0);
		 int count=0;
		 for(int i=0;i<name.length();i++)
		 {
		 if(name.charAt(i)==search){
		 System.out.println(search+" is present at index = "+i);
		 count++;
		 }
		 }
		 System.out.println(search+" is present "+count+" times in entered string ");
	}

}
