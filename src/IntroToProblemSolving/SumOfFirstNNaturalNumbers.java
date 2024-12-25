package IntroToProblemSolving;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Before wiring down the formula for finding sum of first n natural number we can 
	   // actually find or derive the formula explanation is given in Subhesh sir's notes
		
		
		Scanner scn = new  Scanner(System.in);
        int n = scn.nextInt();
        
        int sum = n*(n+1)/2;
            
            System.out.println(sum);
	}

}
