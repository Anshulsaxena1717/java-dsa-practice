package arrayFoundation;

import java.util.Scanner;

public class MaxOfArray {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		
//		int[] arr = new int[n];
//		
//		//input in the array
//		for(int i=0;i<arr.length;i++) {
//			
//			arr[i]=scn.nextInt();
//		}
//		
//		int max=0;
//		for(int i=0 ; i<arr.length;i++) {
//			
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
		 public static int max(int arr[]){
	         int maximum=0;
	        for(int i=0;i<arr.length;i++){
	        
	            if(maximum<arr[i]){
	                maximum = arr[i];
	            }
	        }
	         return maximum;
	        }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        
	        int[] arr = new int[n];
	        
	        //input in the array
	        for(int i=0;i<arr.length;i++) {
	            
	            arr[i]=scn.nextInt();
	        }
	        
	        int answer = max(arr);
	        System.out.println(answer);
	       
	        
	    }
	}


