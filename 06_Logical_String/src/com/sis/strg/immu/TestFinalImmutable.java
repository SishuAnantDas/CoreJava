package com.sis.strg.immu;

import java.util.Date;
import java.util.HashMap;

public class TestFinalImmutable {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("1", "First");
		hm.put("2", "Second");

		Integer i = 10;
		String name = "Original";
		Date mf = new Date();

		FinalImmutable fi = new FinalImmutable(i, name, mf, hm);
		// Lets see whether its copy by field or reference
		System.out.println(name == fi.getNameImmutableField());
		System.out.println(mf == fi.getMutableField());
		System.out.println(hm == fi.getTestMap());

		// print the hm values
		System.out.println("fi id:" + fi.getIdImmutableField());
		System.out.println("fi name:" + fi.getNameImmutableField());
		System.out.println("fi date:" + fi.getMutableField());
		System.out.println("fi testMap:" + fi.getTestMap());

		// change the local variable values
		i = 20;
		name= "modified";
		hm.put("3", "third");
		// print the values again
		System.out.println("fi id after local variable change:" + fi.getIdImmutableField());
		System.out.println("fi name after local variable change:" + fi.getNameImmutableField());
		System.out.println("fi Date after local variable change:" + fi.getMutableField());
		System.out.println("fi testMap after local variable change:" + fi.getTestMap());
		
		HashMap<String, String> hmTest = fi.getTestMap();
		hmTest.put("4", "new");
		
		Date mfTest = new Date(mf.getTime());
		System.out.println("fi mfTest after changing variable from accessor methods:"+fi.getMutableField());
		System.out.println("fi testMap after changing variable from accessor methods:"+fi.getTestMap());
	}

}

/*OUTPUT:
 Performing Deep copy for Object initialization
true
false
false
fi id:10
fi name:Original
fi date:Fri Aug 05 00:47:54 IST 2022
fi testMap:{1=First, 2=Second}
fi id after local variable change:10
fi name after local variable change:Original
fi Date after local variable change:Fri Aug 05 00:47:54 IST 2022
fi testMap after local variable change:{1=First, 2=Second}
fi mfTest after changing variable from accessor methods:Fri Aug 05 00:47:54 IST 2022
fi testMap after changing variable from accessor methods:{1=First, 2=Second}
*/
/*
Performing Shallow copy for Object initialization
true
true
true
fi id:10
fi name:Original
fi date:Fri Aug 05 00:53:15 IST 2022
fi testMap:{1=First, 2=Second}
fi id after local variable change:10
fi name after local variable change:Original
fi Date after local variable change:Fri Aug 05 00:53:15 IST 2022
fi testMap after local variable change:{1=First, 2=Second, 3=third}
fi mfTest after changing variable from accessor methods:Fri Aug 05 00:53:15 IST 2022
fi testMap after changing variable from accessor methods:{1=First, 2=Second, 3=third, 4=new}
*/

