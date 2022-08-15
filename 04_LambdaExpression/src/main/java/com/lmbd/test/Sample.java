//high 
package com.lmbd.test;

public class Sample {

	public static void main(String[] args) {

		//function has 4 things
		//1.name
			//2.parameter -important part of function
			//3.body	  -important part of the function
		//4.return type
		Thread th =new Thread(new Runnable() {
			public void run() {
				System.out.println("In another thread");
			}
		});
		th.start();
		System.out.println("In main");
	}

}
