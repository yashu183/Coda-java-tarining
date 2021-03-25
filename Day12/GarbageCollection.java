package day12;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GarbageCollection {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Before birth ... "+r.freeMemory());
		GrandFather gf = new GrandFather();
		System.out.println("After birth ... "+r.freeMemory());
		//gf = null;
		//System.out.println(gf.gold);
		//r.gc();
		System.out.println("After gc ... "+r.freeMemory());
		gf = null; 
		//weak Reference 
		//WeakReference wr = new WeakReference(gf);
		//System.out.println(gf.gold);
		System.out.println("After weak reference ... "+r.freeMemory());
		r.gc();
		//soft Reference
		//SoftReference sr = new SoftReference(gf);
		gf = null;
		//gf = (GrandFather)sr.get();
		//System.out.println(gf.gold);
		//WeakReference wr = new WeakReference(gf);
	}
}

class GrandFather
{
	String gold = "Under the tree....";
	String space;
	public void fun()
	{
		for(int i = 0; i < 10000; i++)
		{
			space = new String("........"+i);
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize is called");
	}
}