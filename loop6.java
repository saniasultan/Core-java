package basicprograms;

import java.util.Scanner;

public class loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter one value");
byte no=s.nextByte();
int fact=1;
for(byte i=1;i<=no;i++) {
	 fact = fact*i;
}
System.out.println("factorial="+fact);
	}

}
