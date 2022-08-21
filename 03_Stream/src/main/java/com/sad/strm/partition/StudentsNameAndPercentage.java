// Given a list of students, how do you get the name and percentage of each student?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsNameAndPercentage {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));

		Map<String, Double> nameAndPercentageStudent=studentlist.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		
		System.out.println(nameAndPercentageStudent);
	}

}
