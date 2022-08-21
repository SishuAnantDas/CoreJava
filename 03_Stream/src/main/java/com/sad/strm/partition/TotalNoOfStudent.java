//How do you get total number of students from the given list of students?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TotalNoOfStudent {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));
		studentlist.add(new Student("raja", 020, "COA", 89.0));
		studentlist.add(new Student("Ritu", 020, "Java", 89.0));
		studentlist.add(new Student("SRIKANT", 020, "Math", 89.0));
		
		Long totalStudents=studentlist.stream().collect(Collectors.counting());
		System.out.println("totalStudents: "+totalStudents);
	}

}
