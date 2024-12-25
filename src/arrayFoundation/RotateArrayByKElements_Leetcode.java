package arrayFoundation;

import java.util.Scanner;

public class RotateArrayByKElements_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        //input in the array
        for(int i=0;i<arr.length;i++) {
            
            arr[i]=scn.nextInt();
        }
        
        int k = scn.nextInt();
        k=k%arr.length;
        reverse(arr , 0,arr.length-1);
        reverse(arr , 0,k-1);
        reverse(arr , k,arr.length-1);
        
        
        for(int i=0;i<arr.length;i++) {
            
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void reverse(int[] nums , int start,int end) {
        
        
		  while(start<end) {
            
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }

	}

}
