package functions;

import java.util.Scanner;

public class nCrFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		
		int nfact= fact(n);
		int rfact= fact(r);
		int nmrfact=fact(n-r);
		
		int answer = nfact/(rfact*nmrfact);
		System.out.println(answer);

}
	
	public static int fact(int a) {
		int ans=1 ;
		for(int i=1;i<=a;i++) {
			ans=ans*i;	
		}
		return ans;
	}
	

}


//
