package inheritance;

import java.util.Scanner;

//Create Employee class with data members id,name,salary. - Create a default constructor, parameterised constructor 
//- Create TestEmployee class and ask the size for creating Employee array
//- create objects to store in array. - display the data of Employee - write a method to Find out highest salary
class Employee{
	int id;
	String name;
	float salary;


    
	Employee(){
		
	}
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	void display(){
		
		System.out.println("id="+id+"name"+name+"salary"+salary);
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("how many records you want to enter");
byte n=sc.nextByte();
		Employee[] e=new Employee[n];
		for(byte i=0;i<n;i++) {
			System.out.println("enter id,name,salary");
			e[i]=new Employee(sc.nextInt(),sc.next(),sc.nextFloat());
		}
		
//		int[]a=new int[5];
//		Scanner s=new Scanner(System.in);
//		float[] no=new float[5];
//		System.out.println("enter salary");
//		for(byte i=0;i<=4;i++) {
//			no[i]=s.nextFloat();
//		}
//		float max=0;
//		for(byte i=0;i<=4;i++) {
//			if(no[i]>max)
//				max=no[i];
//		}
//		System.out.println("highest salary="+max);
	
	}

}
