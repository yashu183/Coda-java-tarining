package labAssignment;

public class Inheritance {
	public static void main(String[] args) {
		
	}
}

class Parent
{
	private int pvt;
	public int pub;
	protected int pro;
	
	private void pvtMethod()
	{
		
	}
	
	public void pubMethod() {}
	
	protected void proMethod() {}
}

class Child extends Parent
{
	int a,b,c;
	public void fun()
	{
		//System.out.println(pvt);
		System.out.println(pub);
		System.out.println(pro);
	}
	//cant access pvt but can access pub and protected same with methods...
}