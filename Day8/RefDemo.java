package day8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefDemo {
	public static void main(String[] args) throws Exception {
		PoliceStation policestation = new PoliceStation();
		Politician p = new Politician();
		policestation.arrest(p);
	}
}

class PoliceStation
{
	public void arrest(Object p) throws Exception
	{
//		Politician pol = (Politician)p;
//		System.out.println(pol.name);
//		pol.doWork();
		
		//Interrogation
		Class c = p.getClass();
		Field f = c.getField("name");
		System.out.println(f.get(p));
		Method m = c.getMethod("doWork");
		m.invoke(p);
//		f = c.getField("secretName");
//		System.out.println(f.get(p));  //cant access pvt fields..
		
		//Torture cell
		f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(p));
		
		m = c.getDeclaredMethod("secretWork");
		m.setAccessible(true);
		m.invoke(p);
	}
}

class Politician
{
	public String name = "Good Man";
	private String secretName = "Theif";
	
	public void doWork()
	{
		System.out.println("I do Social Work..");
	}
	public void secretWork()
	{
		System.out.println("I steal people money and threaten them...");
	}
}
