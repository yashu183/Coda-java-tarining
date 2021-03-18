package day6;

import java.util.Scanner;

public class WithoutIfElse {
	 public static void main(String[] args) {
			Sa sa = new Sa();
			while(true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter to pull the chain...");
				sc.next();
				sa.pull();
			}
	}
}

class Sa //fan class
{
	Fanspeed fs;
	public Sa()
	{
		this.fs = new Onstate();
	}
	public void setState(Fanspeed fs)
	{
		this.fs = fs;
	}
	public void pull()
	{
		fs.pull(this);
	}
}

abstract class Fanspeed //state
{
	public abstract void pull(Sa sa);
}

class Onstate extends Fanspeed
{
	public void pull(Sa sa)
	{
		System.out.println("On state..");
		sa.setState(new Medium());
	}
}

class Medium extends Fanspeed
{
	public void pull(Sa sa)
	{
		System.out.println("Medium speed..");
		sa.setState(new High());
	}
}

class High extends Fanspeed
{
	public void pull(Sa sa)
	{
		System.out.println("High state..");
		sa.setState(new Offstate());
	}
}

class Offstate extends Fanspeed
{
	public void pull(Sa sa)
	{
		System.out.println("Off state..");
		sa.setState(new Onstate());
	}
}