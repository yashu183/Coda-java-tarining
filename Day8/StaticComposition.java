package day8;

public class StaticComposition {
	public static void main(String[] args) {
		Food fooditem = new Rice();
		System.out.println("Price of rice is : "+fooditem.cost());
		Food fooditem1 = new Rice(new Daal());
		System.out.println("Price of rice and daal is : "+fooditem1.cost());
		Food fooditem2 = new Rice(new Daal(new Chicken()));
		System.out.println("Price of rice, Chicken and daal is : "+fooditem2.cost());
		Food fooditem3 = new Rice(new Daal(new Chicken(new Rice())));
		System.out.println("Price of rice, Chicken, daal and some Rice is : "+fooditem3.cost());
	}
}


abstract class Food
{
	public abstract int cost();
}

abstract class VegFood extends Food
{
	
}

abstract class NonVegFood extends Food
{
	
}

class Rice extends VegFood
{
	public Rice()
	{
		//incase of only rice
	}
	Food food;
	public Rice(Food food) //rice with any other food
	{
		this.food = food;
	}
	@Override
	public int cost()
	{
		if(food != null)
			return 10+food.cost();
		else
			return 10;
	}
}

class Daal extends VegFood
{
	public Daal()
	{
		
	}
	Food food;
	public Daal(Food food)
	{
		this.food = food;
	}
	@Override
	public int cost()
	{
		if(food != null)
			return 5+food.cost();
		else
			return 5;
	}
}

class Chicken extends Food
{
	public Chicken()
	{
		
	}
	Food food;
	public Chicken(Food food)
	{
		this.food = food;
	}
	@Override
	public int cost()
	{
		if(food != null)
			return 20+food.cost();
		else
			return 20;
	}
}