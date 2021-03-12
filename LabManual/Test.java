package labAssignment;

public class Test {
	public static void main(String[] args) {
		//Testing t = new Testing(); // const testing is undefined.. error arguement must ebe passed 
		Testing t = new Testing(1); // works fine when arguement is pased...
	}
}

class Testing
{
	final int ci = 23; //const member
	static int x = 8; //static method...
	int w;
	public void change(int x)
	{
		//ci = x; //final mem cant be changed...
		System.out.println(x); //accessing static var from non-static fun works!!
	}
	//const with one arguement
	public Testing(int x)
	{
		w = x;
	}
}