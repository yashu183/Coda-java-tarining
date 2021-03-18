package FunLabDay5;

public class Lab6Q1 {
	public static void main(String[] args) {
		
	}
}

class Sample
{
	String name;
	int accNum;
	String type;
	int balance;
	public void init()
	{
		name = null;
		accNum = 0;
		type = null;
		balance = 0;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(balance);
	}
	public void bal(int amount)
	{
		if(isBalance())
			balance += amount;
	}
	public boolean isBalance()
	{
		return true;
	}
}