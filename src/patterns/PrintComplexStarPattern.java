package patterns;

import java.util.Scanner;

/*  For n=5
 *              *
 *             ***
 *            *****
 *             ***
 *              * 
 */

public class PrintComplexStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp= n/2;  // For row 1
		int str = 1;   // For row 1

		for(int i=1;i<=n;i++) {
			
			for(int j = 1; j<=nsp ;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++) {
				System.out.print("*");
			}
			
			//Below is preparation for next line
			
			if(i<=n/2) {
				nsp= nsp-1;
				str=str+2;
			}
		    else {
					nsp=nsp+1;
					str = str-2;
				}
			System.out.println();	
			}
		}
		
		
}


