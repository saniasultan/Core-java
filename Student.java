package oops;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentdetails s1=new Studentdetails();
s1.input();
s1.display();

	}

}
class Studentdetails{
	private int stud_id;
	public String name;
	 int rollno;
	 
	 void input() {
		System.out.println("enter student name and roll no");
		Scanner s=new Scanner(System.in);
		name=s.next();
		rollno=s.nextInt();
		stud_id=s.nextInt();
		
	}
	
	void display() {
		System.out.println("Student name="+name+"\trollno="+rollno+" stud id="+stud_id);
	}
}