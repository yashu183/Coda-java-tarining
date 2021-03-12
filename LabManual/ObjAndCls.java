package labAssignment;

public class ObjAndCls {
	public static void main(String[] args) {
		Sample s = new Sample();
		//System.out.println(s.pvt); //pvt ois not visible
		System.out.println(s.pub); //pub works
		System.out.println(s.pro); //pro works
		System.out.println(s.nomod); //nomod works
		
		//s.pvtMethod(); //pvt is not visible
		s.pubMethod(); //public methods works
		s.proMethod(); //protected mwthod works
		s.nomodMethod(); //Nomod methods works
	}
}

class Sample
{
	private int pvt;
	public int pub;
	protected int pro;
	int nomod;
	
	private void pvtMethod()
	{
		System.out.println("pvt is not accessible out the cls");
	}
	
	public void pubMethod()
	{
		System.out.println("public method accessible from outside the class");
	}
	
	protected void proMethod()
	{
		System.out.println("Protected method accesible from outside the cls");
	}
	void nomodMethod()
	{
		System.out.println("Nomod method is accssible from outside the class");
	}
}