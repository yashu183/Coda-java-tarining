package day8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefDemo1 {
	public static void main(String[] args) throws Exception {
		Demo d = (Demo)Class.forName("day8.Demo").getConstructor().newInstance();
		// this is a new way of obj creation (dynbamiucally) without new keyword
		//new keyword is static...
		Demo d1 = (Demo)Class.forName("day8.Demo").getConstructor(String.class).newInstance("Hello");
		
		Field f[]=d.getClass().getFields();
		for(Field field:f) {
			System.out.println(field.getName());
		}
		Method m[] = d.getClass().getMethods();
		for(Method met : m)
		{
			System.out.println(met.getName());
		}
		
		//getting test method
		Method testMethod = d.getClass().getMethod("test", String.class, int.class);
		System.out.println(testMethod.invoke(d,"Yashu",20));
		
		//parent cls methods...
		Method parentm = d.getClass().getSuperclass().getDeclaredMethod("parent");
		parentm.setAccessible(true);
		parentm.invoke(d);
	}
}

class DemoParent
{
	private void parent() {
		System.out.println("parent method....");
	}
}

class Demo extends DemoParent
{
	public int a,b,c;
	public Demo()
	{
		System.out.println("No param constr is called");
	}
	public Demo(String s)
	{
		System.out.println("Param constr is called....");
	}
	public String test(String s, int i)
	{
		return "received string is : "+s+" and the received int is : "+i;
	}
}