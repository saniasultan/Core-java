package ExceptionHandling;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int _heightpiramid = 1;
        Scanner sc = new Scanner(System.in);
       
      
        System.out.print("Entry height of pyramid : ");
        _heightpiramid = sc.nextInt();
        System.out.println("Result                       : ");
        for (int x = 0; x < _heightpiramid; x++) {
            for (int z = (_heightpiramid - 1) - x; z > 0; z--) {
                System.out.print(" ");
            }
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
		 
	}

}
