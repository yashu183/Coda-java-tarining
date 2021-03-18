package labAssignment;

public class Singleton {
	public static void main(String[] args) throws Exception {
		Sample11 s1 = Sample11.createObjects();
		Sample11 s2 = Sample11.createObjects();
		s1.name = "first obj";
		s2.name = "second obj";
		System.out.println(s1.name);
	}
}

class Sample11 implements Cloneable
{
	String name;
	private Sample11()
	{
		System.out.println("const called....");
	}
	private static Sample11 s;
	synchronized public static Sample11 createObjects() throws Exception
	{
		if(s == null)
			s = new Sample11();
		return s.createClone();
	}
	public Sample11 createClone() throws Exception
	{
		return (Sample11)super.clone();
	}
}