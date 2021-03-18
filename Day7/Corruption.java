package day7;

public class Corruption {
	public static void main(String[] args) {
		Operation operation = new Operation();
		Broker dbroker = new DeathCertBroker();
		Broker hbroker = new HotelOpenBroker();
		
		operation.setOperation(0, dbroker);
		operation.setOperation(1, hbroker);
		
		operation.execute(0);
	}
}

class Operation
{
	Broker arr[] = new Broker[2];
	public void setOperation(int opt, Broker broker)
	{
		arr[opt] = broker;		
	}
	
	public void execute(int i)
	{
		arr[i].brokerOperation();
	}
}

abstract class Broker
{
	public Broker()
	{
		
	}
	abstract public void brokerOperation();
}

class DeathCertBroker extends Broker
{
	SevaDept sevadept = new SevaDept();
	public void brokerOperation()
	{
		System.out.println("Reached broker...");
		System.out.println("Death Crert process initiated");
		sevadept.deathCertCmnd();
	}
}

class HotelOpenBroker extends Broker
{
	SevaDept sevadept = new SevaDept();
	public void brokerOperation()
	{
		System.out.println("Reached broker...");
		System.out.println("Hotel building process initiated");
		sevadept.openHotelCmnd();
	}
}

class SevaDept
{
	public void deathCertCmnd()
	{
		Hospital hospital = new Hospital();
		Police police = new Police();
		police.clearance();
		hospital.issueCertificate();
	}
	public void openHotelCmnd()
	{
		Corporation corporation = new Corporation();
		Police police = new Police();
		police.clearance();
		corporation.coeporate();
	}
}

class Corporation
{
	public void coeporate()
	{
		System.out.println("corporate Office reached....");
		System.out.println("Permitted to Build.... ");
	}
}

class Police
{
	public void clearance()
	{
		System.out.println("Police Station reached....");
		System.out.println("Clearance issued....");
		System.out.println("Permitted to proceed.... ");
	}
}

class Hospital
{
	public void issueCertificate()
	{
		System.out.println("Hospital reached....");
		System.out.println("Process initiated....");
		System.out.println("Certificate issued....");
	}
}