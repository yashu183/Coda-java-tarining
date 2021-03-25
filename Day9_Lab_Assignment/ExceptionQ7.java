package day9_lab;

import java.util.Scanner;

public class ExceptionQ7 {
	public static void main(String[] args) {
		int num,den;
		Scanner sc = new Scanner(System.in);
		while(sc.next().charAt(0) != 'q')
		{
			System.out.println("Enter Numerator....");
			num = sc.nextInt();
			System.out.println("Enter denominator...");
			den = sc.nextInt();
			try
			{
				float f = num/den;
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
		}
	}
}
