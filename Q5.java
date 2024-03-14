package ConditionalStatments;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to find the entered character is vowel or not?
		System.out.println("enter a char");
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o') {
			System.out.println(ch+" is  a vowel");
		
		}
		else {
			System.out.println(ch+" is not a vowel");
		}
	}

}
