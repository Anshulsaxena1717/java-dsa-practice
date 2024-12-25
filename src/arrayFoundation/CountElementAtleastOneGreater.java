package arrayFoundation;

import java.util.Scanner;

public class CountElementAtleastOneGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
			
		}
		
		
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>max)
					max=arr[i];
			}
			int count =0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]==max) {
					count++;
				}
			}
			System.out.println(n-count);
		}
		
	}
