//61) Given a list of employees, find out the number of male and female employees in the organization?

package com.sad.strm.opt.emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMaleFemaleEmpTest {

	public static void main(String[] args) {

		List<Employee> emplList=new ArrayList<>();
		emplList.add(new Employee(001, "Sishu", 29, "male", "Software", 2020, 50000.0));
		emplList.add(new Employee(001, "Radha", 28, "female", "I&PR", 2018, 55000.0));
		emplList.add(new Employee(001, "Bubu", 30, "male", "Media", 2016, 80000.0));
		emplList.add(new Employee(001, "Papa", 28, "male", "UI", 2015, 150000.0));
		emplList.add(new Employee(001, "Soumya", 18, "female", "MS", 2018, 120000.0));
		emplList.add(new Employee(001, "Sanjeeb", 25, "male", "Software", 2000, 80000.0));
		emplList.add(new Employee(001, "Rashmi", 66, "female", "UI", 1996, 70000.0));
		
		Map<String, Long> noOfMaleAndFemaleEmployees=emplList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);
	}

}
