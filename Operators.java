package basicprograms;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//write a program to take input from the user and print its square and cube
		Scanner r=new Scanner(System.in);
		System.out.println("enter the radius");
		byte radius=r.nextByte();
		System.out.println("radius="+(radius*radius));
		System.out.println("cube="+(radius*radius)*radius);
	}

}
