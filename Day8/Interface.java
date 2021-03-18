package day8;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Interface {
	public static void main(String[] args)throws Exception {
		Object human = new Human();
		Doctor doctor = (Doctor)human;
		doctor.doCure();
		
		AyurMedClg ayur = new AyurMedClg();
		AloMedClg alo = new AloMedClg();
		
		Doctor doc = (Doctor)Proxy.newProxyInstance(human.getClass().getClassLoader(),
													new Class[] {Doctor.class},
													new MyInvocationHandler(new Object[] {human}));
		
		doc.doCure();
	}
}

class MyInvocationHandler implements InvocationHandler{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		// TODO Auto-generated method stub
//		System.out.println("method invoke invoked....");
//		return method.invoke(doctor);
		Object returnObj = null;
		for(Object ob : obj)
		{
			Method[] m = ob.getClass().getDeclaredMethods();
			for(Method met : m)
			{
				if(met.getName().equals(method.getName()))
				{
					met.setAccessible(true);
					returnObj = method.invoke(ob, args);
				}
			}
		}
		return returnObj;
	}
}

interface Doctor
{
	public void doCure();
}

class Human implements Doctor
{
	@Override
	public void doCure()
	{
		System.out.println("Do cure execxuted....");
	}
}

class AyurMedClg implements Doctor
{
	@Override
	public void doCure()
	{
		System.out.println("Ayurvedic logic implemented....");
	}
}

class AloMedClg implements Doctor
{
	@Override
	public void doCure()
	{
		System.out.println("Alopathy logic implemented....");
	}
}