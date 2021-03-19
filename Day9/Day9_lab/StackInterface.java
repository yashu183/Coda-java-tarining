package day9_lab;

import java.util.Scanner;

public class StackInterface {
	public static void main(String[] args) {
		Stack fs = new FixedStack(5);
		Stack ds = new DynamicStack();
		fs.push(7);
		System.out.println(fs.pop());
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		do
		{
			if(Character.isDigit(ch))
				ds.push(ch);
			else
				break;
			ch = sc.next().charAt(0);
		}while(Character.isDigit(ch));
		System.out.println(ds.pop());
	}
}

interface Stack
{
	public void push(int i);
	public int pop();
}

class FixedStack implements Stack
{
	int size;
	int[] arr;
	int start;
	public FixedStack(int n)
	{
		size = n;
		arr = new int[n];
		start = size;
	}
	@Override
	public void push(int i)
	{
		if(start == 0)
		{
			System.out.println("Fixed Stack overflow....");
		}
		else
		{
			start--;
			arr[start] = i;
		}
	}
	
	public int pop()
	{
		if(start == size)
		{
			System.out.println("Fixed Stack Under Flow....");
			return -1;
		}
		else
		{
			int q = arr[start];
			arr[start] = 0;
			start++;
			return q;
		}
	}
}

class DynamicStack implements Stack
{
	int size = 5;
	int[] arr = new int[5];
	int start = 5;
	public DynamicStack()
	{

	}
	@Override
	public void push(int i)
	{
		if(start == 0)
		{
			System.out.println("Fixed Stack overflow....");
			System.out.println("Resizing the size.....");
			int ext = size*2;
			int[] arr1 = new int[ext];
			for(int j = size-1; j >= 0; j--)
			{
				arr1[j] = arr[j];
			}
			start = size-1;
			arr[start] = i;
			size = ext;
		}
		else
		{
			start--;
			arr[start] = i;
		}
	}
	
	public int pop()
	{
		if(start == size)
		{
			System.out.println("Fixed Stack Under Flow....");
			return -1;
		}
		else
		{
			int q = arr[start];
			arr[start] = 0;
			start++;
			return q;
		}
	}
}