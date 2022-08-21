//Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?
package com.sad.strm.opt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestStudentPartition {

	public static void main(String[] args) {

		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student("Sishu", 001, "OS", 85.0));
		studentList.add(new Student("Raghu", 002, "math", 95.0));
		studentList.add(new Student("Papa", 007, "C", 75.0));
		studentList.add(new Student("Som", 005, "COA", 65.0));
		studentList.add(new Student("rick", 12, "JAVA", 58.0));
		studentList.add(new Student("anant", 025, "Spring", 55.0));
		studentList.add(new Student("Ram", 011, "JPA", 80.0));
		
		Map<Boolean, List<Student>> studentpartitioneByPercentage=studentList.stream().collect(Collectors.partitioningBy(student ->student.getPercentage()>60.0));
		
		for (Entry<Boolean, List<Student>> student2 : studentpartitioneByPercentage.entrySet()) {
			 System.out.println("Key = " + student2.getKey() +
                     ", Value = " + student2.getValue());
		}
		

	}

}
