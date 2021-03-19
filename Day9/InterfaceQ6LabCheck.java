package day9;

import day9_lab.InterfaceQ6;

public class InterfaceQ6LabCheck {
	public static void main(String[] args) {
		InterfaceQ6 sample = new InterfaceQ6();
		//sample.met();
		Sample1 sample1 = new Sample1();
		sample1.sample1Method();
		
	}
}

class Sample1 extends InterfaceQ6
{
	public void sample1Method()
	{
		InterfaceQ6 sample11 = new InterfaceQ6();
		//sample11.met();
	}
}