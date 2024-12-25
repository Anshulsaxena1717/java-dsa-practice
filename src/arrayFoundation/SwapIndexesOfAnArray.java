package arrayFoundation;

import java.util.Scanner;

public class SwapIndexesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		//input in the array
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
		}
		
		int firstIndex = scn.nextInt();
		int secondIndex = scn.nextInt();
		
        int tempIndex = 0;
		for(int i=0;i<n;i++) {
			
			 tempIndex= arr[firstIndex];
			arr[firstIndex] = arr[secondIndex];
			arr[secondIndex]=tempIndex;
			
		}
		
		for(int i=0 ;i<n;i++) {
			
			System.out.print(arr[i]);
		}
	}

}
