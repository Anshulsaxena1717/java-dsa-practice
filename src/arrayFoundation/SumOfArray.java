package arrayFoundation;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		//input in the array
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
	}

}
