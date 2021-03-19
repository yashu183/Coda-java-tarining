package day9;

import java.lang.reflect.*;

public class CheckedException {
	public static void main(String[] args) throws Exception {
		String s = "hello";
		Field f[] = s.getClass().getFields();
		String name = "str";
		boolean isThere = false;
		for(Field fe : f)
		{
			//System.out.println(fe.getName());
			if(fe.getName().equals(name))
				isThere = true;
		}
//		try
//		{
//			Field ff = s.getClass().getField("str");
//		}catch(Exception e) {
//			
//		}
		if(isThere)
		{
			Field fe = s.getClass().getField("str");
		}
		else
			System.out.println("No filed is there....");
	}
}
