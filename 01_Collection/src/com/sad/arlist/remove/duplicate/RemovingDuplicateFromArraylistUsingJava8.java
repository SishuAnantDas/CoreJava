package com.sad.arlist.remove.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateFromArraylistUsingJava8 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("sishu","papa","raghu","sishu","papa","som");
		
		List<String> removedList=list.stream().distinct().collect(Collectors.toList());
		removedList.forEach(System.out::println);
	}

}
