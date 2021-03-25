package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Date {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate date = currentDateTime.toLocalDate();
		System.out.println("Present Date... : "+date);
		
		Month month = currentDateTime.getMonth();
		System.out.println("Present Month... : "+month);
		
		int day = currentDateTime.getDayOfMonth();
		int sec = currentDateTime.getSecond();
		
		System.out.println("Present day... : "+day);
		System.out.println("Present sec... : "+sec);
		
		LocalDateTime date2 = currentDateTime.withDayOfMonth(10).withYear(3030);
		System.out.println("set date : "+date2);
	}
}
