package com.jav.clln;

import java.util.HashSet;

public class InternalOfHashSet {

	public static void main(String[] args) {

		HashSet<String> set=new HashSet<>();
		System.out.println(set);
		set.add("Sishu");
		set.add("Raghu");
		set.add("som");
		System.out.println(set); //Insertion order is not preserve in HashSet
		
		System.out.println(set.add("Sishu"));
		System.out.println(set.add("papa"));

		System.out.println(set);
		
		String s="NUMBER";
		String sn=new String();
		
		
	}

}
