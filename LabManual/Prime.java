package labAssignment;
import java.util.*;
public class Prime {
	public static String prime1(int n)
	{
		if(n == 1)
			return "Neither prime npor composite";
		else if(n == 2)
			return "Is a prime";
		else if(n < 1)
			return "Not a prime";
		else if(n%2 == 0)
			return "Not a prime";
		else
	        for (int i = 3; i <= Math.sqrt(n); i += 2) 
	        {
	            if (n % i == 0)
	                return "Not a prime";
	        }
		return "Is a prime";
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		System.out.println(prime1(n));
	}
}
