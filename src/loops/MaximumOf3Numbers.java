package loops;

import java.util.Scanner;

public class MaximumOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if(a>=b && a>=c) {
			
			System.out.println("a is greater");
		}
		else if (b>=a && b>=c) {
			
			System.out.println("b is greater");
			
		}
		else {
			System.out.println("c is greater");
		}
		
		
		
	}

}
