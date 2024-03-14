package oops;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fibonacci f=new Fibonacci();
	}

}
class Fibonacci {
	byte no;
	Fibonacci(){
		System.out.println("enter one number:");
		Scanner s=new Scanner(System.in);
		no=s.nextByte();
		byte a=0,b=1,c;
		System.out.print(a+" "+b);
		for(byte i=3;i<=no;i++) {
			c=(byte) (a+b);
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}