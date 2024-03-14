package logicalanddatatypes;

import java.util.Scanner;

public class Qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to take any employee details and display it.
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter employee id");
		int employee_id=s.nextInt();
		System.out.println("enter city");
		String city=s.next();
		System.out.println("name="+name+"\t employee id="+employee_id+" \tcity="+city);
	}

}
