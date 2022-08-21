// How do you get the students grouped by subject from the given list of students?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.sad.strm.opt.Student;

public class StudentGroupBySubjectTest {

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
		
		Map<String, List<Student>> studentsGroupBySubject =studentlist.stream().collect(Collectors.groupingBy(Student::getSubject));
	

		for (Entry<String, List<Student>> student2 : studentsGroupBySubject.entrySet()) {
			 System.out.println("Key = " + student2.getKey() +
                    ", Value = " + student2.getValue());
		}
	}

}
