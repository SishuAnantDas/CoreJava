 //Given a list of students, how do you get the subjects offered in the college?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class SubjectOfferedByCollege {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));
		
		Set<String> subjectOffered=studentlist.stream().map(Student::getSubject).collect(Collectors.toSet());
		
		System.out.println("subjectOffered"+subjectOffered);
	}

}
