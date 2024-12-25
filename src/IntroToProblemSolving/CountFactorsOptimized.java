package IntroToProblemSolving;

import java.util.Scanner;

public class CountFactorsOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		int count =0;
		
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) 
			{
			if(i==n/i) 
			{
				count++;
			}else 
			{
				count=count+2;
			}
		    }
			
		}
		System.out.println(count);
		
	}
}