package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThressLocalDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			Resource r = new Resource("first - 1");
//			r.getResource();
//			System.out.println(r);
			
			r = new Resource("first - 2");
//			r.getResource();
//			System.out.println(r);
		});
		es.execute(()->{
			Resource r = new Resource("Second - 1");
//			r.getResource();
//			System.out.println(r);
		});
	}
}

class ThreadLocalUtility
{
	private static ThreadLocal tlocal = new ThreadLocal();
	public Resource getResource(String s)
	{
		Resource r = (Resource)tlocal.get();
		if(r == null)
		{
			new Resource(s);
			tlocal.set(r);
		}
		r.name = s;
		return r;
	}
	
}

class Resource
{
	String name;
	public Resource(String s)
	{
		this.name = s;
		System.out.println("Const.. called.... obj created....");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}