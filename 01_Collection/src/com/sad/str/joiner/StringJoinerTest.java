package com.sad.str.joiner;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {

		StringJoiner stringJoiner = new StringJoiner(" | ");
		// StringJoiner stringJoiner=new StringJoiner(" | ","[","]");

		stringJoiner.add("Whatapp");
		stringJoiner.add("Youttube");
		stringJoiner.add("Instagram");
		stringJoiner.add("LinkedIn");
		stringJoiner.add("Twitter");
		stringJoiner.add("Facebook");
		
		

		System.out.println(stringJoiner);
		
		
		String[] stringArr =new String[] {"Whatapp","Youttube","Instagram","LinkedIn","Twitter"};

		//stringJoiner.add(stringArr); compile time error .so we can add string[] to StringJoiner Calss
	}

}

//Output : Whatapp | Youttube | Instagram | LinkedIn | Twitter | Facebook
//output: [Whatapp | Youttube | Instagram | LinkedIn | Twitter | Facebook]