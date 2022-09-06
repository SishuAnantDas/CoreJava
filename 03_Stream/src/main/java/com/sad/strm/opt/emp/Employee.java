package com.sad.strm.opt.emp;

public class Employee {
	
	Integer id;
	String name;
	Integer age;
	String gender;
	String deppartment;
	Integer yearOfJoining;
	Double salary;
	
	
	public Employee(Integer id, String name, Integer age, String gender, String deppartment, Integer yearOfJoining,
			Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deppartment = deppartment;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeppartment() {
		return deppartment;
	}
	public void setDeppartment(String deppartment) {
		this.deppartment = deppartment;
	}
	public Integer getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deppartment="
				+ deppartment + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
