package arrayFoundation;

import java.util.Scanner;

public class ReverseAnArray {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		//input in the array
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
		}
		
		reverse(arr);
		
        for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
		}
		
	}
	
	public static void reverse(int[] num) {
		
		int sp=0;
		int ep=num.length-1;
		
		while(sp<ep) {
			
			int temp= num[sp];
			num[sp]=num[ep];
			num[ep]= temp;
			sp++;
			ep--;
		}
	}
}
