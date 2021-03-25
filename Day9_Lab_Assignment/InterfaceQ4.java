package day9_lab;

public class InterfaceQ4 {
	public static void main(String[] args) {
		Test test = new Test();
		test.met1(test);
		test.met2(test);
		test.met3(test);
		test.met4(test);
	}
}

interface Inter1
{
	public void met11();
	public void met12();
}

interface Inter2
{
	public void met21();
	public void met22();
}

interface Inter3
{
	public void met31();
	public void met32();
}

interface Inter extends Inter1,Inter2,Inter3
{
	public void newMet();
}

class Test implements Inter
{
	@Override
	public void newMet()
	{
		System.out.println("New met.....");
	}

	@Override
	public void met11() {
		// TODO Auto-generated method stub
		System.out.println("Met 11.....");
	}

	@Override
	public void met12() {
		// TODO Auto-generated method stub
		System.out.println("Met 12.....");
	}

	@Override
	public void met21() {
		// TODO Auto-generated method stub
		System.out.println("Met 21.....");
	}

	@Override
	public void met22() {
		// TODO Auto-generated method stub
		System.out.println("Met 22.....");
	}

	@Override
	public void met31() {
		// TODO Auto-generated method stub
		System.out.println("Met 31.....");
	}

	@Override
	public void met32() {
		// TODO Auto-generated method stub
		System.out.println("Met 32.....");
	}
	
	//new methods
	public void met1(Inter1 inter1)
	{
		System.out.println("Met 1.....Inter 1......");
	}
	public void met2(Inter2 inter2)
	{
		System.out.println("Met 2.....Inter 2......");
	}
	public void met3(Inter3 inter3)
	{
		System.out.println("Met 3 .... Inter 3......");
	}
	public void met4(Inter inter)
	{
		System.out.println("Met 4......");
	}
}