package com.sad.arlist.remove.duplicate;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayListUsingNewlist {

	public static void main(String[] args) {
		
		ArrayList< Integer> list2=new ArrayList<>();
		list2.add(11);
		list2.add(33);
		list2.add(44);
		list2.add(11);
		list2.add(22);
		list2.add(22);
		list2.add(33);
		
		ArrayList<Integer> removedList=new ArrayList<>();
		
		//checking each and every element of the array list and
		//creating a new arraylist and checking  if the element is not present in the list, we are adding the element to the list. 
		for (Integer num : list2) {
			if (!removedList.contains(num)) {
				removedList.add(num);
			}
		}
		
		removedList.forEach(System.out::println);
		
	}

}
