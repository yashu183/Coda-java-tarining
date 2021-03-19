package day9;

public class ExceptionHandlingDemo {
	public static void main(String[] args) throws DogExceptions {
		Dog dog = new Dog();
		Child child = new Child();
		Item stick = new StickItem();
		Item stone = new StoneItem();
		child.playWithDog(dog, stone);
	}
}

abstract class DogExceptions extends Exception
{
	public abstract void handling(HandlerImp handler);
}

class DogBiteException extends DogExceptions
{
	String msg;
	public DogBiteException(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}
	public void handling(HandlerImp handler)
	{
		handler.handle(this);
	}
}

class DogBarkException extends DogExceptions
{
	String msg;
	public DogBarkException(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		return msg;
	}
	public void handling(HandlerImp handler)
	{
		handler.handle(this);
	}
}

abstract class Item
{
	public abstract void execute() throws DogExceptions;
}

class StickItem extends Item
{
	@Override
	public void execute() throws DogBiteException
	{
		throw new DogBiteException("You beat I bite....");
	}
}

class StoneItem extends Item
{
	@Override
	public void execute() throws DogBarkException
	{
		throw new DogBarkException("You hit I bark......");
	}
}

class Dog
{
	public void play(Item item) throws DogExceptions
	{
		item.execute();
	}
}

class Child
{
	public void playWithDog(Dog dog, Item item)
	{
		try {
		dog.play(item);
		}catch(DogExceptions de)
		{
			//de.printStackTrace();
			de.handling(new HandlerImp());
		}
	}
}

interface Handler
{
	public void handle(DogBiteException dbie);
	public void handle(DogBarkException dbre);
}

class HandlerImp implements Handler
{
	@Override
	public void handle(DogBiteException dbie)
	{
		System.out.println("Dont worry .. ambulance is on the way...");
	}
	
	@Override
	public void handle(DogBarkException dbre)
	{
		System.out.println("It just barks... no worries....");
	}
}