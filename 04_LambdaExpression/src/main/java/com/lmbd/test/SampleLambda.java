//02 just the essence
package com.lmbd.test;

public class SampleLambda {

	public static void main(String[] args) {
		// function has 4 things
		// 1.name -anonymous
			// 2.parameter -important part of function
			// 3.body -important part of the function
		// 4.return -inferred
		Thread th = new Thread(() ->System.out.println("In another thread"));
		th.start();
		System.out.println("In main");
	}

}
