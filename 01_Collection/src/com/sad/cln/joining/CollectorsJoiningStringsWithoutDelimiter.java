package com.sad.cln.joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningStringsWithoutDelimiter {

	public static void main(String[] args) {

		List<String> strList=Arrays.asList("Whatapp","Youttube","Instagram","LinkedIn","Twitter" );
		
		
		List<String> strListWD =Arrays.asList("Whatapp","Youttube","Instagram","LinkedIn","Twitter");
		List<String> strListWDPS =Arrays.asList("Whatapp","Youttube","Instagram","LinkedIn","Twitter");
		
		String strWithoutDelimeter =strList.stream().collect(Collectors.joining());
		String strWithDelimeter =strListWD.stream().collect(Collectors.joining("|"));
		String strWithoutDelimeterPrefixSuffix  =strListWDPS.stream().collect(Collectors.joining("|","[","]"));

		
	System.out.println("strWithoutDelimeter :"+strWithoutDelimeter);
	System.out.println("strWithDelimeter :"+strWithDelimeter);
	System.out.println("strWithoutDelimeterPrefixSuffix :"+strWithoutDelimeterPrefixSuffix);
	}

}
/*
 * OutPut 
 * strWithoutDelimeter :WhatappYouttubeInstagramLinkedInTwitter
 * strWithDelimeter :Whatapp|Youttube|Instagram|LinkedIn|Twitter
 * strWithoutDelimeterPrefixSuffix
 * :[Whatapp|Youttube|Instagram|LinkedIn|Twitter]
 */
