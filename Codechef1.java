package oops;

import java.util.Scanner;

public class Codechef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        
	        int N = input.nextInt();
	        int M = input.nextInt();

	        int X = input.nextInt();
	        int Y = input.nextInt();

	       
	        int totalTreats = (N * X) + (M * Y);

	     
	        System.out.println("Suri Bhai gets a total of " + totalTreats + " treats.");

	        input.close();
	}

}
