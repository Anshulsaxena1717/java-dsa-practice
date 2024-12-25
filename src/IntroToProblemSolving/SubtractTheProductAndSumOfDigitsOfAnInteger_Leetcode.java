package IntroToProblemSolving;

import java.util.Scanner;

//My First Leetcode solved problem

public class SubtractTheProductAndSumOfDigitsOfAnInteger_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scn = new  Scanner(System.in);
        int n = scn.nextInt();
        
       
        int product =1;
        int sum = 0;
        
        while(n>0)
        {	
        int	lastdigit=n%10;
        product	= product*lastdigit;
        sum	= sum+lastdigit;
        n=n/10;
        }
        

         int answer = product-sum;
        System.out.println(answer);
	}

}
