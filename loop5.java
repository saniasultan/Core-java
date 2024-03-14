package basicprograms;

import java.util.Scanner;

public class loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter one value");
byte no=s.nextByte();

for(byte i=1;i<=10;i++) {
	System.out.println(no*i);
}
	}

}
