package basicprograms;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String str=sc.nextLine();
		System.out.println("hello "+str+" length="+str.length()+" charAt "+str.charAt(2));
		System.out.println("concat="+str.concat(" hello"));
		System.out.println("lower="+str.toLowerCase());
		System.out.println("upper="+str.toUpperCase());
		System.out.println("compare="+str.compareTo("abc"));
		System.out.println("ignore="+str.compareToIgnoreCase("SANIA"));
		System.out.println("substring="+str.substring(2));
		System.out.println("substring="+str.substring(1, 4));
//		String[] name=new String[5];
//		System.out.println("Enter 2 Students name");
//		for(byte i=0;i<=1;i++)
//			name[i]=sc.next();
//		for(String s:name)
//			System.out.println(s);
	}

}
