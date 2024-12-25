package patterns;

import java.util.Scanner;
/*

for n = 5
*** ***
**   **
*     *
**   **
*** ***




*/
public class PrintComplexStarDiamondHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp=1;
		int str = n/2+1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=str;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=nsp;k++) {
				System.out.print(" ");
				
			}
			for(int l=1;l<=str;l++) {
				System.out.print("*");
			}
			
			
			// preparation for next line
			if(i<=n/2) {
				nsp=nsp+2;
				str= str-1;
			}
			else {
				nsp=nsp-2;
				str=str+1;
			}
			System.out.println();
		}
		
		
	}

}
