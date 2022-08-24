package com.sad.strg.remove.duplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		String str="sishuanant";
		
		//Approach-1 using java 8
		
		StringBuilder sb=new StringBuilder();
		str.replaceAll("\\s","").chars().distinct().forEach(c->sb.append((char)c));
		
		System.out.println("Using java8 :"+sb);
		
		//Approach 2 using indexOf()
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int index=str.indexOf(c, i+1);
			if (index==-1) {
				sb2.append(c);
			}
		}
		System.out.println("Using indexOf :"+sb2);
		
		//Approach 3 using charArray()
		StringBuilder sb3=new StringBuilder();
		char[] charArr=str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			boolean repeated=false;
			for(int j=i+1;j<charArr.length;j++) {
				if (charArr[i]==charArr[j]) {
					repeated=true;
					break;
				}
			}
			if (!repeated) {
				sb3.append(charArr[i]);
			}
		}
		
		System.out.println("using chararray :"+sb3);

		//Approach-4 using set collection
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(char c:set) {
			sb4.append(c);
		}
		System.out.println("using set :"+sb4);

	}

}
