package com.sis.strg.immu;

import java.util.*;

public final class FinalImmutable {
//1->Declare the class as final so it can not be extended.
	
	//Integer idImmutableField;
	//2->Make all the fields private so that direct access not allowed.
	private final Integer idImmutableField;
	
	
	private final String nameImmutableField;
	
	//private  Date mutableField;
	//3->make all the mutable fields as final so that it's value can be assigned only once.
		
	private final Date mutableField;
	
	//Accessor function for mutable objects
	private final HashMap<String, String> testMap;
	
	//4->Don't provide setters to change the state of an object and this is what we want to prevent here.

	public Integer getIdImmutableField() {
		return idImmutableField;
	}

	public String getNameImmutableField() {
		return nameImmutableField;
	}

	public Date getMutableField() {
		return mutableField;
		//return new Date(mutableField.getTime());
	}

	public HashMap<String, String> getTestMap() {
		return testMap;
		//6->Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
		//return (HashMap<String, String>) testMap.clone();
		//Accessor function for mutable objects
	}
	
	/**
	 * Constructor performing Deep Copy
	 * @param i
	 * @param n
	 * @Param d
	 * @param hm
	 */
	
	/*public FinalImmutable(Integer i,String n,Date d, HashMap<String, String> hm) {
		System.out.println("Performing Deep copy for Object initialization");
		this.idImmutableField=i;
		this.nameImmutableField=n;
		this.mutableField=new Date(d.getTime());
		
		HashMap<String ,String > tempMap=new HashMap<>();
		String key;
		Iterator<String> itr=hm.keySet().iterator();
		while(itr.hasNext()) {
			key=itr.next();
			tempMap.put(key, hm.get(key));
		}
		
		this.testMap=tempMap;
		
	}*/

	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @Param d
	 * @param hm
	 */

	public FinalImmutable(Integer i, String n, Date d,
			HashMap<String, String> hm) {
		System.out.println("Performing Shallow copy for Object initialization");

		this.idImmutableField = i;
		this.nameImmutableField = n;
		this.mutableField = d;
		this.testMap = hm;
	}
	
	
	
}
