package loops;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		if(n<0) {
			n=n*-1;
		}

		while(n>0){
			
		int lastdigit =	n%10 ;
		System.out.print(lastdigit);
		n =n/10;
			
		}
		
	}

}
