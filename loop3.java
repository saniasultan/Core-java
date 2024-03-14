package basicprograms;

import java.util.Scanner;

public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take 5 value from user nd print addition
		Scanner s=new Scanner(System.in);
		byte i=1;
		byte no;
		int sum=0;
		System.out.println("enetr 5 values");
		while(i<=5) {
			no=s.nextByte();
			sum=sum+no;
			i++;
			
		}
		System.out.println("Addition="+sum);
	}

}
