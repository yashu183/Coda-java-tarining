package labAssignment;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		int jan = 1;
		int feb = 2;
		int mar = 3;
		int apr = 4;
		int may = 5;
		int jun = 6;
		int jul = 7;
		int aug = 8;
		int sep = 9;
		int oct = 10;
		int nov = 11;
		int dec = 12;
		
		switch(feb)
		{
		case(1):
			System.out.println("31 days in January");
			break;
		case(2):
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter the year");
			int n = sc.nextInt();
			if(n%400 == 0)
				System.out.println("29 days in February");
			else
				System.out.println("28 days in February");
			break;
		case(3):
			System.out.println("31 days in March");
			break;
		case(4):
			System.out.println("30 days in April");
			break;
		case(5):
			System.out.println("31 days in May");
			break;
		case(6):
			System.out.println("30 days in June");
			break;
		case(7):
			System.out.println("31 days in July");
			break;
		case(8):
			System.out.println("31 days in August");
			break;
		case(9):
			System.out.println("30 days in September");
			break;
		case(10):
			System.out.println("31 days in October");
			break;
		case(11):
			System.out.println("30 days in November");
			break;
		case(12):
			System.out.println("31 days in December");
			break;
		}
	}
}
