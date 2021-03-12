package labAssignment;

public class CompileAndCheck {
	public static void main(String[] args) {
		CompileAndCheck cac = new CompileAndCheck();
		Derived used = cac.new Derived();
		used.UseD();
	}
	protected class Base
	{
		public String method()
		{
			return "wow";
		}
	}
	
	class Derived
	{
		public void UseD()
		{
			Base z = new Base(); 
			System.out.println("base says, " + z.method()); 
		}
	}
}
