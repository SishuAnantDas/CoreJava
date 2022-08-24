package com.sad.ary.sum;

import java.util.HashSet;

public class FindPairofArrayElementSumResultX_Optimize {

	public static void main(String[] args) {

		int ar[] = { 3,6, 9, 11, 13,8, };
		int target = 14;
		printPairs(ar, target);

	}

	public static void printPairs(int arr[], int sum) {

		HashSet<Integer> hs = new HashSet<>();
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			temp = sum - arr[i];
			if (hs.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is " + arr[i] + "," + temp);
			} else {
				hs.add(arr[i]);
			}
		}
	}

}

//Output
/*
 * Pair with given sum 14 is 11,3 
 * Pair with given sum 14 is 8,6 Complexity
 * Analysis:
 * 
 * Time Complexity: O(n). As the whole array is needed to be traversed only once.
 *  Auxiliary Space: O(n). A hash map has been used to store array elements.
 */