package day7;

public class Clone {
	public static void main(String[] args) throws Exception{
		Sample s1 = Sample.createObj();
		s1.str = "first Obj";
		Sample s2 = Sample.createObj();
		s2.str = "second obj";
		System.out.println(s2.str);
		s1.setSample2(Sample2.createObj());
		s1.setSample2(Sample2.createObj());
		System.out.println(s1.getSample2());
		s1.setSample2(Sample2.createObj());
		System.out.println(s1.getSample2());
		s1.setSample2(Sample2.createObj());
	}
}

class Sample implements Cloneable
{
	String str;
	Sample2 sample2;
	
	public Sample2 getSample2() {
		return sample2;
	}
	public void setSample2(Sample2 sample2) {
		this.sample2 = sample2;
	}
	private Sample()
	{
		System.out.println("Sample constr. called ....");
	}
	private static Sample s;
	public static Sample createObj() throws Exception
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

class Sample2 implements Cloneable
{
	private Sample2()
	{
		System.out.println("Sample 2 constr. called....");
	}
	private static Sample2 s2;
	public static Sample2 createObj() throws Exception
	{
		if(s2 == null)
			s2 = new Sample2();
		return s2.createClone();
	}
	public Sample2 createClone() throws Exception
	{
		return (Sample2)super.clone();
	}
}