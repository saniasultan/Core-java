package basicprograms;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[5];
		Scanner s=new Scanner(System.in);
		float[] no=new float[5];
		System.out.println("enter percentage of 5 students");
		for(byte i=0;i<=4;i++) {
			no[i]=s.nextFloat();
		}
		float max=0;
		for(byte i=0;i<=4;i++) {
			if(no[i]>max)
				max=no[i];
		}
		System.out.println("max percentage="+max);
	}

}
