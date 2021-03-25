package day13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(10,5); //first one initial size.... sec one incre,mental size...
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
		
		//enumeration obj...
		Enumeration<String> e = v.elements();//it accepts the modifications...
		v.add("aftre venumeration...");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
}

