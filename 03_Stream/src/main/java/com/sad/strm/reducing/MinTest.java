package com.sad.strm.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinTest {

	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 11, 44, 676, 88, 80);

		// Using stream.min() to get minimum
        // element according to provided Integer Comparator
		int min = list.stream().min(Integer::compare).get();
		int max=list.stream().max(Integer::compare).get();
		long count=list.stream().count();
		
		System.out.println("Minimun : "+min);
		System.out.println("Maximum : "+max);
		System.out.println("Count : "+count);
		
		
		
		Stream<String> strm=Stream.of("s","a","f","g","h");
		
		List<String> arrayList=strm.collect(Collectors.toList());
		System.out.println(arrayList.toString());
	}
		
}
