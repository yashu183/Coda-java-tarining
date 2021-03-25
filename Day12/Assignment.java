package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		System.out.println("Enter Distance... in kms ");
		Scanner sc = new Scanner(System.in);
		int dis = sc.nextInt();
		System.out.println("Enter travel speed... in kms per hr");
		int speed = sc.nextInt();
		System.out.println("Enter Working hours per day....");
		int workinghrs = sc.nextInt();
		
		//date time....
		LocalDateTime localtime = LocalDateTime.now();
		LocalDate date = localtime.toLocalDate();
		int day = localtime.getDayOfMonth();
		int year = localtime.getYear();
		int month = localtime.getMonthValue();
		
		//calculate...
		int hours = dis/speed;
		int numOfDays = hours/workinghrs;
	}
}

enum Holidays
{
	
}