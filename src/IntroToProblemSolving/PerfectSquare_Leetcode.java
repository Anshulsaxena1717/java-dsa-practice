package IntroToProblemSolving;

import java.util.Scanner;

// Solution is working but in leetcode it is exceeding time limit we need to use Binary search to solve this problem.
// After binary search topic will be taught need to re attempt it.

public class PerfectSquare_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int ans =1;
		for(int i=1;i*i<=n;i++) {
			
			ans =i;
		}
		
		if(ans*ans==n) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
