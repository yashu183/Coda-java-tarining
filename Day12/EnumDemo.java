package day12;

public class EnumDemo {
	public static void main(String[] args) {
		Cars c;
		c = Cars.mm;
		met(c);
		Cars car[] = Cars.values();
		print(car);
		System.out.println(c.getPrice());
	}
	public static void met(Cars car)
	{
		switch(car)
		{
		case mm:
			System.out.println("Maruthi");
			break;
		case s:
			System.out.println("Suzuki");
			break;
		default:
			System.out.println("Default called....");
		}
	}
	public static void print(Cars[] car)
	{
		for(Cars c : car)
		{
			System.out.print(c+" : ");
			System.out.println(c.getPrice());
		}
	}
}

enum Cars
{
	mm(1000),s(2000),b,h;
	int price;
	Cars()
	{
		System.out.println("Default const called....");
	}
	Cars(int x)
	{
		System.out.println("Parameterized const called...");
		System.out.println("Received integer is : "+x);
		this.price = x;
	}
	public int getPrice()
	{
		return this.price;
	}
}