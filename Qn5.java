package Loops;

import java.util.Scanner;

public class Qn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print entered name n number of times.
		System.out.println("enter your name");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		for(int i=1;i<=10;i++) {
			System.out.println(name);
		}
	}

}
