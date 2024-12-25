package loops;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
	    int	count = 0;
		
	 for(int i = 1 ; i <=n ; i++) {
		 
		 if(n%i==0) {
			 count++;
			 
		 }
		
	}
      if (count==2) {
    	  System.out.println("Number is prime");
      }
      else {
    	  System.out.println("Number is not prime");
      }
}
}
