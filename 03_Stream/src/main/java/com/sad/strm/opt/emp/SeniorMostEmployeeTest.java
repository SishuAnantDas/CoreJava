//Given a list of employees, how do you find out who is the senior most employee in the organization?
package com.sad.strm.opt.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeniorMostEmployeeTest {

	public static void main(String[] args) {

		List<Employee> emplList = new ArrayList<>();
		emplList.add(new Employee(001, "Sishu", 29, "male", "Software", 2020, 50000.0));
		emplList.add(new Employee(002, "Raghu", 28, "male", "Media", 2018, 55000.0));
		emplList.add(new Employee(004, "Bubu", 30, "male", "Media", 2016, 80000.0));
		emplList.add(new Employee(005, "Papa", 28, "male", "UI", 2015, 150000.0));
		emplList.add(new Employee(006, "Som", 18, "male", "Media", 2018, 120000.0));
		emplList.add(new Employee(0077, "Sanjeeb", 25, "male", "Software", 2000, 80000.0));
		emplList.add(new Employee(0014, "Rashmi", 66, "male", "UI", 1996, 70000.0));
		
		//Printing stream
		Stream<Employee> streamOfEmployee=emplList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining));
		
		System.out.println(" Print the stream using forEach()");
		streamOfEmployee.forEach(s->System.out.println(s));
		System.out.println(" Print the stream using with collect()");
		//System.out.println(streamOfEmployee.collect(Collectors.toList()));
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//Hence proved  Streams are traversable only once.
		Stream<Employee> streamOfEmployee2=emplList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(streamOfEmployee2.collect(Collectors.toList()));

		System.out.println(" Print the stream using peek()");
		// Print the stream using peek()
        // by providing a terminal operation count()
		Stream<Employee> streamOfEmployee3=emplList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining));

		streamOfEmployee3.peek(s -> System.out.println(s)).count();
		
		
		Optional<Employee> seniorMostEmployee=emplList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println("seniorMostEmployee :"+seniorMostEmployee.get());
		
	}

}
