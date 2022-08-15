package com.sis.strg.reverse;

public class TestReverseWithOutMethod {

	public static void main(String[] args) {
		
		String str="Sishu";
		String rev=reverseString(str);
		System.out.println("Str:"+str);
		System.out.println("rev:"+rev);
	}

	public static String reverseString(String str) {
		char[] chArry=str.toCharArray();
		String revStr="";
		
		
		for(int i=chArry.length-1;i>=0;i--) {
			revStr +=chArry[i];
		}
		return revStr;
	}
}
