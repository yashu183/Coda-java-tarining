package FunLabDay5;

public class Lab6Q2 {
	public static void main(String[] args) {
		
	}
}

class Sample1
{
	String name;
	int accNum;
	String type;
	int balance;
	public Sample1() {
		// TODO Auto-generated constructor stubtype = null;
		this.type = null;
		this.name = null;
		this.accNum = 0;
		this.balance = 0;
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