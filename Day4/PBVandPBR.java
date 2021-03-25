package day4;

public class PBVandPBR {
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println("Before everything...");
		System.out.println(s.size);
		PBV pbv = new PBV();
		pbv.fun(s.size); //we are passing original size by value and assigning it to '0' in the fun .. but it wont change
		                 // a copy of value is passed so no change in the original...
		System.out.println("After Pass By Value..");
		System.out.println(s.size);
		PBR pbr = new PBR();
		pbr.fun(s); // here passing object of class "Sample"
		            // when we pass an obj by default its pass by reference..
		System.out.println("After Pass BY Reference...");//reference is passed so any changes now made will reflectr in original one...
		System.out.println(s.size);
	}
}

//if u are passing primitive types (int,float,string,byte,long,char) they are pass by value by default
//if u are passing user defined datatype such as obj then its pass by reference any changes will be reflected in the original one.. 

class Sample
{
	int size = 10;
}

class PBV
{
	public void fun(int size)
	{
		size = 0;
	}
}

class PBR
{
	public void fun(Sample s)
	{
		s.size = 100;
	}
}