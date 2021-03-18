package day6;

public class MethodRefDemo {
	public MethodRefDemo()
	{
		
	}
	
	public void fun1() //non-static method
	{
		System.out.println("jst in fun1");
	}
	
	public MethodRefDemo(int i, String s) //constr.
	{
		System.out.println("got integer : "+i+" got string : "+s);
	}
	
	public static String fun3(String s) //static method
	{
		return "returnable string : "+s;
	}
	
	public static void main(String[] args) {
		myInt myint1 = new MethodRefDemo()::fun1;
		myint1.fun();
		
		myInt1 myint2 = MethodRefDemo::new;
		myint2.fun(10000,"Yashwanth");
		
		myInt3 myint3 = MethodRefDemo::fun3;
		System.out.println(myint3.fun("Yashwanth"));
	}
}
