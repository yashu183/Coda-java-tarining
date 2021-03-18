package FunLabDay5;

import java.util.Scanner;

public class VowelOrNot {
	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char");
		c = sc.next().charAt(0);
		switch(c)
		{
		case 'a':
			System.out.println("Vowel");
		    break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a vowel");
		}
	}
}
