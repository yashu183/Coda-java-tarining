package labAssignment;

import java.util.Scanner;

public class Question15Set1 {
	public static void prime1(int n)
	{
		int k = 0;
	        for (int i = 2; i <= n/2; i += 1) 
	        {
	            if (n % i == 0)
	            {
	            	k = 1;
	            	break;
	            }
	        }
		if(k == 0)
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
		System.out.print(2+" ");
		for(int i = 3; i <= 100; i++)
		{
			prime1(i);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number");
		int n = sc.nextInt();
		AmgPalinPerf a = new AmgPalinPerf(n);
	}
}

class AmgPalinPerf
{
	int n;
	int i = 0;
	int arrs[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1} ;
	
	public AmgPalinPerf(int x)
	{
		n = x;
	}
	public void fun()
	{
		int i = 0;
		while(n>=10)
		{
			int temp;
			temp = n%10;
			n = n/10;
			arrs[i] = temp;
			i++;
		}
		arrs[i] = n;
		boolean isPalin = true;
		boolean isAmg = false;
		boolean isPer = false;
		int start = 0;
		int end = arrs.length-1;
		while(start <= end)
		{
			if(arrs[start] != arrs[end])
			{
				isPalin = false;
			}
		}
		int ans = 0;
		for(int j = 0; j < arrs.length; j++)
		{
			if(arrs[i] != -1)
			{
				ans += arrs[i]*arrs[i]*arrs[i];
			}
		}
		if(ans == n)
		{
			isAmg = true;
		}
		int fac = 0;
		for(int k = 1; k <= n/2; k++)
		{
			if(n%k == 0)
			{
				fac += k;
			}
		}
		if(fac == n)
		{
			isPer = true;
		}
		if(isPalin)
		{
			System.out.println(n+" is a palindrome");
		}
		if(isAmg)
		{
			System.out.println(n+" is a Amgstrong number");
		}
		if(isPer)
		{
			System.out.println(n+" is a perfect number");
		}
	}
	
}