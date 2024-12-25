package IntroToProblemSolving;

import java.util.Scanner;

public class FloorOfSquateRootN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new  Scanner(System.in);
        int n = scn.nextInt();
        
        int root = 0 ;
        for(int i=1;i*i<=n;i++) {
        	
   
        		 root = i;
        	
        }
        
        
		System.out.println(root);
	}

}
