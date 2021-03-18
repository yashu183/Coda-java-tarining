package day6;

public class CreationOfClsObj  {
	public static void main(String[] args) throws Exception {
		//cant  create objects if constr is pvt
		//Sample s =  new Sample(); // throws error
		
		//how to create 
		Sample s1 = Sample.createObjects();
		Sample s2 = Sample.createObjects();
		s1.name = "first obj";
		s2.name = "second obj";
		System.out.println(s1.name);
	}
}

class Sample implements Cloneable
{
	String name;
	private Sample()
	{
		System.out.println("const called....");
	}
	private static Sample s;
	synchronized public static Sample createObjects() throws Exception
	{
		if(s == null)
			s = new Sample();
		return s.createClone();
	}
	public Sample createClone() throws Exception
	{
		return (Sample)super.clone();
	}
}