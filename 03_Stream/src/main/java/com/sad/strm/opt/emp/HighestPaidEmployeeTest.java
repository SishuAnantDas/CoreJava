//Write a Java 8 code to get the details of highest paid employee in the organization from the given list of employees?
package com.sad.strm.opt.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeTest {

	public static void main(String[] args) {

		

		List<Employee> emplList=new ArrayList<>();
		emplList.add(new Employee(001, "Sishu", 29, "male", "Software", 2020, 50000.0));
		emplList.add(new Employee(001, "Raghu", 28, "male", "I&PR", 2018, 55000.0));
		emplList.add(new Employee(001, "Bubu", 30, "male", "Media", 2016, 80000.0));
		emplList.add(new Employee(001, "Papa", 28, "male", "UI", 2015, 150000.0));
		emplList.add(new Employee(001, "Som", 18, "male", "MS", 2018, 120000.0));
		emplList.add(new Employee(001, "Sanjeeb", 25, "male", "Software", 2000, 80000.0));
		emplList.add(new Employee(001, "Rashmi", 66, "male", "UI", 1996, 70000.0));
		
		Optional<Employee> employee=emplList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	
		System.out.println(employee.get());
	}

}
