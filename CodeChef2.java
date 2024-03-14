package oops;

import java.util.Scanner;

public class CodeChef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        int T = scanner.nextInt(); 

		        for (int t = 0; t < T; t++) {
		            int N = scanner.nextInt(); 
		            int[] A = new int[N]; 

		           
		            for (int i = 0; i < N; i++) {
		                A[i] = scanner.nextInt();
		            }

		            int totalCandies = 0;

		         
		            for (int i = 0; i < N; i++) {
		                totalCandies += A[i];
		            }

		            if (totalCandies % N != 0) {
		                System.out.println("NO");
		            } else {
		                int desiredCandies = totalCandies / N;
		                boolean possible = true;

		                for (int i = 0; i < N; i++) {
		                    if (A[i] % 2 != 0) {
		                        possible = false;
		                        break;
		                    }
		                    int diff = A[i] - desiredCandies;
		                    if (diff > 0 && diff % 2 != 0) {
		                        possible = false;
		                        break;
		                    }
		                }

		                if (possible) {
		                    System.out.println("YES");
		                } else {
		                    System.out.println("NO");
		                }
		            }
		        }
		    }
		}


