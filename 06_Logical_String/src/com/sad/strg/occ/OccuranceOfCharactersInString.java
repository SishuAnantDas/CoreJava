package com.sad.strg.occ;
import java.util.*;

public class OccuranceOfCharactersInString {

	public static void main(String[] args) {

		String str="aasdsadsdcccdf ddds";
		occuranceOfString(str);
	}
	public static void occuranceOfString(String str) {
		
		//char[] charArray=str.toCharArray();
		char[] charArray=str.replaceAll("\\s+","").toCharArray(); // space removing
		
		HashMap<Character,Integer> charMap=new HashMap<>();
		
		int maxOcc=0;
		char maxChar = 0;
		
		for(char c:charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}    
			
			if(charMap.get(c)>maxOcc) {
				maxOcc=charMap.get(c);
				maxChar=c;
			}
				
		}
		
		for(Map.Entry entry : charMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("Max Occurance ("+maxChar+") :"+maxOcc);
	}

}
