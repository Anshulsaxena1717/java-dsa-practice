package loops;

import java.util.Scanner;

public class CountNumberOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
	    int	count = 0;
		
	 for(int i = 1 ; i <=n ; i++) {
		 
		 if(n%i==0) {
			 System.out.println(i+" is a factor of "+ n);
			 count++;
			 
		 }
		 
	 }
	 System.out.println("Total number of factors are " +count);
	}

}
