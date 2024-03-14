package basicprograms;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte[][] no=new byte[3][4];
Scanner s=new Scanner(System.in);
System.out.println("enter 12 values");
for(byte i=0;i<=2;i++) {
	for(byte j=0;j<=3;j++) {
		no[i][j]=s.nextByte();
		
	}
	
}
System.out.println("array elements are:");
for(byte i=0;i<=2;i++) {
	for(byte j=0;j<=3;j++) {
		System.out.print(" "+no[i][j]);
	}
	System.out.println();
}
	}

}
