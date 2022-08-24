package com.sad.strg.reverse;

import java.util.Arrays;

public class StringReverseByMiddle {

	public static void main(String[] args) {

		String s = "Sishu";
		System.out.println(reverse(s));

	}

	public static String reverse(String str) {

		// char arr[] =str.toCharArray();
		char arr[] = str.replaceAll("\\s+", "").toCharArray();
		String revstr = "";
		int length = str.length();
		int middle = 0;
		char temp;
		int j = arr.length - 1;

		if (length % 2 == 0) {
			middle = length / 2;
		} else {
			middle = (length + 1) / 2;
		}

		for (int i = 0; i < middle; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}

		revstr = Arrays.toString(arr);

		return revstr;

	}
}
