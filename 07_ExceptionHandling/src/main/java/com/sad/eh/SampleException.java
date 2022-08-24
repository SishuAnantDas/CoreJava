package com.sad.eh;

public class SampleException {

	public static void main(String[] args) {

		doMore();
	}
	public static void doMore() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
	}

}
