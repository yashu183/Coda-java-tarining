package day9_lab;

public class AreaVol {
	public static void main(String[] args) {
		
	}
}

interface Area
{
	public void calArea();
}

interface Volume
{
	public void calVol();
}

abstract class Square
{
	
}

class AreaOfSq extends Square implements Area
{
	int side;
	public AreaOfSq(int q)
	{
		side = q;
	}
	@Override
	public void calArea()
	{
		System.out.println("Area of Square : "+side*side);
	}
}

class VolOfSq extends Square implements Volume
{
	int side;
	public VolOfSq(int q)
	{
		side = q;
	}
	@Override
	public void calVol()
	{
		System.out.println("Perimeter of Square : "+4*side);
	}
	
}