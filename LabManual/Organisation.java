package labAssignment;

public class Organisation {
	public static void main(String[] args) {
		
	}
}

class Employee
{
	Date d = new Date();
}

class SalesPerson extends Employee
{
	Date d = new Date();
}

class Worker extends Employee
{
	Date d = new Date();
}

class SalesManager extends SalesPerson
{
	Date d = new Date();
}

class SalesTeritoryManager extends SalesManager
{
	Date d = new Date();
}

class Date
{
	int day;
	String month;
	int year;
}