package day12;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkAndJoinDemo {
	public static void main(String[] args) {
		String[] arr = {"padala","meghana","kalpana","kanpur","megha","raghul","raghul","mohan","raghul","meghana"};
		int count = 0;
		for(String s : arr)
		{
			if(s.equalsIgnoreCase("raghul"))
				count++;
		}
		System.out.println("Count of raghul : "+count);
		
		ForkJoinPool fjp = ForkJoinPool.commonPool();
		MyTask mytask1 = new MyTask(arr,0,3,"raghul");
		MyTask mytask2 = new MyTask(arr,3,5,"raghul");
		MyTask mytask3 = new MyTask(arr,5,7,"raghul");
		MyTask mytask4 = new MyTask(arr,7,10,"raghul");
		
		int total = fjp.invoke(mytask1)+fjp.invoke(mytask2)+fjp.invoke(mytask3)+fjp.invoke(mytask4);
		System.out.println("Returned by Fork and Join .. count of Raghul is : "+total);
	}
}

class MyTask extends RecursiveTask<Integer>
{
	String[] arr;
	int start,end;
	String search;
	public MyTask(String[] arr, int start, int end, String search)
	{
		this.arr = arr;
		this.start = start;
		this.end = end;
		this.search = search;
	}
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = start; i < end; i++)
		{
			if(arr[i].equalsIgnoreCase("raghul"))
				count++;
		}
		return count;
	}
}