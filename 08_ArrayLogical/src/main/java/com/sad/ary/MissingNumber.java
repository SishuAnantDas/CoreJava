package com.sad.ary;

public class MissingNumber {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,7,8,9,10};
		
		for(int i=1;i<11;i++) {
			if(!(i%array[i-1]==0)) {
				System.out.println(i);
				break;
			}
		}
	}

}
