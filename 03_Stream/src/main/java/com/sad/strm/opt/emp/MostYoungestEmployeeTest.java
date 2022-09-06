//Given a list of employees, get the details of the most youngest employee in the organization?
package com.sad.strm.opt.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostYoungestEmployeeTest {

	public static void main(String[] args) {


		List<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee(001, "Sishu", 29, "male", "Software", 2020, 50000.0));
		emplList.add(new Employee(002, "Raghu", 28, "male", "Media", 2018, 55000.0));
		emplList.add(new Employee(004, "Bubu", 30, "male", "Media", 2016, 80000.0));
		emplList.add(new Employee(005, "Papa", 28, "male", "UI", 2015, 150000.0));
		emplList.add(new Employee(006, "Som", 18, "male", "Media", 2018, 120000.0));
		emplList.add(new Employee(0077, "Sanjeeb", 25, "male", "Software", 2000, 80000.0));
		emplList.add(new Employee(0014, "Rashmi", 66, "male", "UI", 1996, 70000.0));
		
		Optional<Employee> empOptional=emplList.stream().min(Comparator.comparingInt(Employee::getAge));
		
		System.out.println(empOptional.get());
	}

}
