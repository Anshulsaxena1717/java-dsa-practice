package patterns;

import java.util.Scanner;

public class PrintTriangleWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

		
	}

}
