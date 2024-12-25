package arrayFoundation;

import java.util.Scanner;

// Working as expected but it is brutefore more optimized code is available.

public class LargestNumberAtLeastTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		//input in the array
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
		}
		
		int max=0;
		int index=0;
		for(int i=0;i<n;i++) {
		
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
			
		}
		int count=0;
		for(int i=1;i<n;i++) {
			
			if(arr[i]==max) {
				count++;
			}
		}
		
		if(count>=2) {
			System.out.println(index);
		}else {
			System.out.println("-1");
		}

	}

}
