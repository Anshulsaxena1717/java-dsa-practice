package arrayFoundation;

import java.util.Scanner;

public class ReversePartOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        //input in the array
        for(int i=0;i<arr.length;i++) {
            
            arr[i]=scn.nextInt();
        }
        
        int startingIndex = scn.nextInt();
        int endingIndex = scn.nextInt();
        
        
        reverse(arr , startingIndex, endingIndex);
        
        for(int i=0;i<arr.length;i++) {
            
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void reverse(int[] num , int startingIndex,int endingIndex) {
        
        
		int sp=startingIndex;
        int ep= endingIndex;
        
        while(sp<ep) {
            
            int temp= num[sp];
            num[sp]=num[ep];
            num[ep]= temp;
            sp++;
            ep--;
        }
	}

}
