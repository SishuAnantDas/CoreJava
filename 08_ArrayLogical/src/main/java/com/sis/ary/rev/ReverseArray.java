package com.sis.ary.rev;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int [] array= {1,2,3,4,5,6,7};
		
		System.out.println("array:"+Arrays.toString(array));
		
		reverseArray(array);
	}

	private static void reverseArray(int[] array) {

		int length=array.length;
		int middle=0;
		int temp=0;
		int j=array.length-1;
		
		if(length%2==0) {
			middle=length/2;
		}else {
			middle=(length+1)/2;
		}
		
		for(int i=0;i<middle;i++) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j--;
		}
		
		System.out.println("ReversedArray:"+Arrays.toString(array));
	}

}
