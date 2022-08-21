//Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students?
package com.sad.strm.partition;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class StatisticsOfStudent {

	public static void main(String[] args) {


		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student("Sishu", 001, "Java", 99.0));
		studentlist.add(new Student("Raghhu", 002, "Math", 98.0));
		studentlist.add(new Student("Som", 003, "OS", 55.0));
		studentlist.add(new Student("Papa", 007, "C", 88.0));
		studentlist.add(new Student("Sanjeeb", 011, ".net", 45.0));
		studentlist.add(new Student("rashmi", 020, "COA", 89.0));
		
		DoubleSummaryStatistics studentStatistics=studentlist.stream().collect(Collectors.summarizingDouble(Student::getPercentage));

		System.out.println("Highest Percentage : "+studentStatistics.getMax());
		System.out.println("Lowest Percentage : "+studentStatistics.getMin());
		System.out.println("Average Percentage : "+studentStatistics.getAverage());
		System.out.println("Count  : "+studentStatistics.getCount());
		System.out.println("Sum of percentage  : "+studentStatistics.getSum());
	}

}
