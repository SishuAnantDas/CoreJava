//Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in A[] whose sum is exactly x. 
//
package com.sad.ary.sum;

public class FindPairOfArrayElementSumResultX {

	public static void main(String[] args) {

		int array[]= {3,9,11,13};
		int target=14;
		int size=array.length;
		
		
		 if (checkPair(array, size,target)) {
	          System.out.println("Valid pair exists");
	      }
	      else {
	          System.out.println("No valid pair exists for " + target );
	      }

		
		
		
	}
	
	public static boolean checkPair(int arr[], int size, int x) {
		
		for(int i=0;i<size -1;i++) {

			for(int j=(i+1); j<size;j++) {
							
				if((arr[i]+arr[j]) == x) {
					System.out.println("Pair with a given sum "+x+" is "+arr[i]+","+arr[j]+")");
					
					return true;
				}
			}
		}
		
		return false;
		
	}

}

//Output
//Time Complexity: O(n2)
//Auxiliary Space: O(1)
