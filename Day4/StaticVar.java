package day4;

//there are three types of variables

/*
 * 1. instance variable
 * 2. class variable
 * 3. local variable
 */

//instance var and class var are initialized to default values but not loical var

public class StaticVar {
	public int inst; //instance var
	static int cls; // class var
	//local var is inside any scope..
	public void fun()
	{
		int x; //local var
		System.out.println(inst);
		System.out.println(cls);
		//System.out.println(x); // uninitialized error.. bcz local var
		//static int y; // cant declare a static var inside a fun ...
	}
	public static void main(String[] args) {
		System.out.println(cls);
		//System.out.println(inst); //static fun cant have non-static var
		clasroom c= new clasroom();
		clasroom c1 = new clasroom();
		//static int i; // cant declare static var inisde fun even inside a satic fun
	}
}

//for that class only one variable is created that is class var
//for every instance .. one instance var is created.. so 2 proj obj will be created for each classroom obj
//but only one canteen obj will be created for one class i.e. classroom class..

//we cant declare a static var inside a method...

class clasroom
{
	static canteen c = new canteen();
	proj p = new proj();
}

//using instance var bcs to have multiple instances
class proj
{
	public proj()
	{
		System.out.println("Proj is created");
	}
}

//using static bcz only one instancre will be creayted
class canteen
{
	public canteen()
	{
		System.out.println("canteen is created");
	}
}