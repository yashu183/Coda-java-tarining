package day7;

public class Abstract {
	public static void main(String[] args) {
		Dominos pizza = new LocalPizza();
		pizza.processAtDominos();
	}
}

abstract class Dominos
{
	final public void processToCook()
	{
		System.out.println("Dominos has defined the process...");
	}
	final public void processOfAddingIngredients()
	{
		System.out.println("Dominos had defined the ingedients...");
	}
	final public void processOfPacking()
	{
		System.out.println("Dominos has defined the packing...");
	}
	final public void processOfCollection()
	{
		System.out.println("Dominos has defined process of collection");
	}
	abstract public void cookPizza();
	abstract public void deliverPizza();
	final public void processAtDominos()
	{
		cookPizza();
		deliverPizza();
		processOfCollection();
	}
}

class LocalPizza extends Dominos
{
	@Override
	public void cookPizza()
	{
		System.out.println("Cooking started....");
		processToCook();
		processOfAddingIngredients();
		System.out.println("Pizza is ready....");
	}
	
	@Override
	public void deliverPizza()
	{
		processOfPacking();
		System.out.println("Pizza is delivered");
		//processOfCollection();
	}
}