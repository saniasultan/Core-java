package basicprograms;

import java.util.Scanner;

public class loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
byte i=1;
byte no;
int count=0;
System.out.println("enetr 10 values");
while(i<=10) { 
no=s.nextByte();
i++;

	if(no>0) {
		count+=1;
}

	}
System.out.println("enetred positive  values are "+count);
	}}
