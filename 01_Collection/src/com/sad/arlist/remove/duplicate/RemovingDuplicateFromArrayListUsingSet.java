package com.sad.arlist.remove.duplicate;
import java.util.*;
public class RemovingDuplicateFromArrayListUsingSet {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("sishu","papa","raghu","sishu","papa","som");
		
		Set<String> set=new HashSet<>(list);
		System.out.println("Before Duplicate: "+list);
		System.out.println("After Duplicate: "+set);
		
	}

}
