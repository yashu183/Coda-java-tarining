package day4;

//jvm - java virtual machines .. all java prgms executed using jvm
//static func are readily loaded in memory ... jvm searches for main() fun
//u cant find run as java application if u dont write main() in ur prgm
// there can be one more main fun also but jvm wont search for this method

//static method can call another static method without ctreating the objkect
//static methods cant call non-statiuc method bcz they are not in memory
// if u want to call non-static method then create the obj of the cls of that particular method..
//static method wont use "this" and "super" keywords..

//we can also have static var and static block

public class StaticMethodsDemo {
	public static void main(String[] args) {
		main(new int[] {1,2,3}); //statiuc method acn call another static ,method directely
		//main('c'); // this cant woirk until u create an obj foir the class
		StaticMethodsDemo smd = new StaticMethodsDemo();
		smd.main('c'); // this works bcz we have created a obj
		//to call a static fun which is in another class... call using class name no need to create an obj
		A.fun(); //works .. classname.funName.. to call a static fun which is in another cls
		// if we call another static un then also statioc block is called only once
		A.fun2();
	}
	
	public static void main(int[] arr)
	{
//		this. // throwsa error cxANT USE THIUS KEYWORD
//		super.clone(); //throws error .. cant use super keyword too in static fun
	}
	
	public void main(char c)
	{
		main(new int[] {6,7,8}); // we can call static fun from non-static fun directly
		
	}
}

//static blocks called only once .. used to initialize...
//static vars are initialized upon declaration....

class A
{
	static
	{
		System.out.println("static block is called");
	}
	static int i;
	public static void fun()
	{
		System.out.println("inisde fun function of class 'A'");
	}
	public static void fun2()
	{
		System.out.println("inside fun2 fo class'A' also static block called once...");
	}
}