package com.sis.str.join;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethodTest {

	public static void main(String[] args) {
		
		//String.join() Method Example : Joining the strings
		String string=String.join("|", "Whatapp","Youttube","Instagram","LinkedIn","Twitter" );
		
		//String.join() Method Example : Joining an array of strings
		String[] stringArr =new String[] {"Whatapp","Youttube","Instagram","LinkedIn","Twitter"};
		
		String stringArray =String.join("|", stringArr);
		//String.join() Method Example : Joining list of strings
		List<String> strlist =Arrays.asList("Whatapp","Youttube","Instagram","LinkedIn","Twitter" );
		
		String  stringlist=String.join("|", strlist);
		
		
		
		System.out.println("String Join: "+string);
		System.out.println("String Join Array: "+stringArray);
		System.out.println("String Join List: "+stringlist);
	
	}

}
/*out put:
 * String Join: Whatapp|Youttube|Instagram|LinkedIn|Twitter String Join Array:
 * Whatapp|Youttube|Instagram|LinkedIn|Twitter String Join List:
 * Whatapp|Youttube|Instagram|LinkedIn|Twitter
 */