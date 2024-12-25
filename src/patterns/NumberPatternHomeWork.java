package patterns;

import java.util.Scanner;

/*
Pattern for n = 5.  
 
    1  
  2 3 2  
3 4 5 4 3  
  2 3 2  
    1  


Need to understand it need to give more time

*/
public class NumberPatternHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp= n/2;  // For row 1
		int nst = 1;   // For row 1
		int count =1;

		for(int i=1;i<=n;i++) {
			
			for(int j = 1; j<=nsp ;j++) {
				System.out.print("  ");
			}
			
			if(i<=n/2) {
				count=i;
			}
			else {
				count= n-i+1;
			}
			
			
			for(int k=1;k<=nst;k++) {
				System.out.print(count+" ");
				
				if(k<nst/2+1) {
					count++;
				}else {
					count--;
				}
			}
			
			//Below is preparation for next line
			
			if(i<=n/2) {
				nsp= nsp-1;
				nst=nst+2;
			}
		    else {
					nsp=nsp+1;
					nst = nst-2;
				}
			System.out.println();	
			
		}
		
		

	}
}
