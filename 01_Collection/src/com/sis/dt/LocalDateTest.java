package com.sis.dt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate lDate=LocalDate.now();
		LocalTime localTime=LocalTime.now();
		LocalDateTime localDateTime=LocalDateTime.now();
		
		System.out.println("localDate :"+lDate);
		System.out.println("localTime :"+localTime);
		System.out.println("localDateTime :"+localDateTime);
		
	
	}

}
