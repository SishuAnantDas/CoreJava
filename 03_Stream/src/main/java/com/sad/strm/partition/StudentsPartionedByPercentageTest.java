//Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsPartionedByPercentageTest {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("Sishu", 001, "os", 77.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));

		Map<Boolean, List<Student>> studnetspartitionedbyPercentageMap = studentlist.stream()
				.collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
		System.out.println("student >60: " + studnetspartitionedbyPercentageMap);

	}

}
