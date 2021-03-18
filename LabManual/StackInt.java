package labAssignment;

import java.util.Scanner;

public class StackInt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of stack");
		int n = sc.nextInt();
		Stack s = new Stack(n);
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
	}
}


class Stack
{
	int size;
	static int start = 0;
	int arr[];
	public Stack(int n)
	{
		size = n;
		arr = new int[size];
		start = size - 1;
	}
	//Arrays.fill(arr,Integer.MAX_VALUE);
	public void push(int x)
	{
		arr[start] = x;
		start--;
	}
	public void pop()
	{
		arr[start] = 0;
		start++;
	}
	public void display()
	{
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	public boolean isEmpty()
	{
		if(start == -1)
			return true;
		else
			return false;
	}
}