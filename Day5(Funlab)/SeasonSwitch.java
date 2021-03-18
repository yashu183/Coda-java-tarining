package FunLabDay5;

import java.util.Scanner;

public class SeasonSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month");
		String ss = sc.nextLine();
		switch(ss)
		{
		case "January":
			System.out.println("Spring");
			break;
		case "February":
			System.out.println("Spring");
			break;
		case "March":
			System.out.println("Spring");
			break;
		case "April":
			System.out.println("Summer");
			break;
		case "May":
			System.out.println("Summer");
			break;
		case "June":
			System.out.println("Summer");
			break;
		case "July":
			System.out.println("Rainy");
			break;
		case "August":
			System.out.println("Rainy");
			break;
		case "September":
			System.out.println("Rainy");
			break;
		case "October":
			System.out.println("Winter");
			break;
		case "November":
			System.out.println("Winter");
			break;
		case "December":
			System.out.println("Winter");
			break;
		default:
			System.out.println("Enter correctly !!!");
		}
	}
}
