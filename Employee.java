package oops;

import java.util.Scanner;

public class Employee {
int emply_id;
String name;
void input() {
	System.out.println("enter employee id and name");
	Scanner s=new Scanner(System.in);
	emply_id=s.nextInt();
	name=s.next();
	
}                                 
void display() {
	System.out.println("id="+emply_id+"\tname:"+name);
}
}
