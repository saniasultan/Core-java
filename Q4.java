package Strings;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the number of vowels present in entered string.
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String");
		 String name = sc.nextLine();
		 int count=0;
		 int cons=0;
		 for(char i:name.toCharArray())
		 {
		 switch (i){
		 case 'a':
		 case 'i':
		 case 'e':
		 case 'o':
		 case 'u':
		 case 'A':
		 case 'I':
		 case 'E':
		 case 'O':
		 case 'U':
		 count++;
		 default:
		 cons++;
		 }
		 }
		 System.out.println("vowels: "+count);
		 System.out.println("Consonants : "+cons);
	}

}
