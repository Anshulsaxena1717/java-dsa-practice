package IntroToProblemSolving;

import java.util.Scanner;

public class NthFabonacciNumber_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		
		for(int i=1;i<=n;i++) {
			
			int c= a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
