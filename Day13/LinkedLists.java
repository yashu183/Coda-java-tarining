package day13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

//wont has enumeration rest is same (between vectors and linkedlists..
public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<String> v = new LinkedList<String>(); //first one initial size.... sec one incre,mental size...
		v.add("Hewllo");
		v.add("Hiii");
		v.add("ASFGFYFYTFYU");
		
		//ioterator..
		Iterator<String> iter = v.iterator();//anything modified after this it wont reflect...instead it throws exception
		//v.add("addedddd");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
}
