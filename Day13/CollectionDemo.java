package day13;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Stream;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("Hii");
		list.add("aaaaaa");
		list.add(new String("usingString cls"));
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("__________________________________________");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		System.out.println("********************************************");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println(iter.hasNext()); //cant use again
		Iterator<String> iter1 = list.iterator(); //we have to do this again if we want bto use this again
		
		//list iterator
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("******************************************");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("********************************************");
		System.out.println("Hii is there in the list ?? : "+list.contains("Hii"));
		System.out.println("Hii_there is there in the list ?? : "+list.contains("Hii_there"));
		System.out.println("***********************************************");
		//remove....
		list.remove("Hii");
		System.out.println("After removing'Hii'");
		System.out.println("Hii is there in the list ?? : "+list.contains("Hii"));
		System.out.println("*************************************************");
		
		//comparator...
		list.sort(new MyComparator());
		System.out.println("after sorting normal ascending : "+list);
		list.sort((o1,o2)->{return o2.compareTo(o1);});
		System.out.println("after sorting lambda descending : "+list);
		System.out.println("**************************************************");
		Stream stream = list.stream();
		System.out.println(stream.count());
	}
}

class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

class Employee
{
	
}