package day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		Object obj = new ImporterImp();
		Importer impobj = (Importer)obj;
		Exporter expobj = new ExporterImp();
		obj = Proxy.newProxyInstance(impobj.getClass().getClassLoader(), 
								new Class[] {Importer.class,Exporter.class,MegaExport.class}, 
								new MyInvocationHandler(new Object[] {impobj,expobj}));
		
		//importerImpObj.doImport();
		Importer imp = (Importer)obj;
		imp.doImport();
		Exporter exp = (Exporter)obj;
		exp.doExport();
		
		//extended prop
		MegaExport meg = (MegaExport)obj;
		System.out.println(meg.doMegaExport("Yashu"));
	}
}

class MyInvocationHandler implements InvocationHandler
{
	Object returnObj = null;
	Object obj[];
	
	public MyInvocationHandler(Object[] obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		for(Object o : obj)
		{
			Method[] m = o.getClass().getDeclaredMethods();
			for(Method met : m)
			{
				if(met.getName().equals(method.getName()))
				{
					met.setAccessible(true);
					returnObj = met.invoke(o, args);
				}
				
			}
		}
		return returnObj;
	}
	
}

interface Importer
{
	public void doImport();
}

class ImporterImp implements Importer
{
	@Override
	public void doImport()
	{
		System.out.println("Doing Import ......");
	}
}

interface Exporter
{
	public void doExport();
}

interface MegaExport
{
	public String doMegaExport(String s);
}

class ExporterImp implements Exporter,MegaExport
{
	@Override
	public void doExport()
	{
		System.out.println("Doing Export ......");
	}
	
	@Override
	public String doMegaExport(String s)
	{
		System.out.println("Doing Mega Export....");
		return "Receved passed arguement : "+s;
	}
}