//Given a list of students, write a Java 8 code to get the names of top 3 performing students?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3performingStudentTest {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("Sishu", 001, "os", 77.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));

		List<Student> top3Students=studentlist.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		
		System.out.println("Top 3 Student : "+ top3Students);
	}

}
