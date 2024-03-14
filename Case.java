package basicprograms;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
switch(Character.toLowerCase(ch)) {
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
	
	
	System.out.println("vowel "+ch);
	break;
	default:
		System.out.println("consonent "+ch);	
}


	}

}
