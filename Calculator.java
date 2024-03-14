package basicprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose a Operator : + - / *");
			char operator=sc.next().charAt(0);
			
			System.out.print("Enter First Number :");
			int a=sc.nextInt();
			System.out.print("Enter Second Number :");
			int b=sc.nextInt();
			
			switch(operator) {
			case '+':
				
					System.out.print("Addition is :");
					System.out.println(a+b);
					break;
				
			case '-':
				if(operator=='-') {
					System.out.print("Subtraction is :");
					System.out.println(a-b);
					break;
				}
			case '*':
				if(operator=='*') {
					System.out.print("Multiplication is :");
					System.out.println(a*b);
					break;
				}
			case '/':
				if(b!=0) {
					System.out.print("Division is :");
					System.out.println(a/b);
					break;
				} else {
					System.out.println("Denometor cant be 0.../");
				}
			
			default:
				System.out.println("Choose valid option.....");
			
			}
	}

}
