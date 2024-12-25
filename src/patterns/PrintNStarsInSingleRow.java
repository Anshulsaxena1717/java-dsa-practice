package patterns;

import java.util.Scanner;

public class PrintNStarsInSingleRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		
		for(int i=1 ; i<=n;i++) {
			
			System.out.print("*");
		}
		
	}

}
