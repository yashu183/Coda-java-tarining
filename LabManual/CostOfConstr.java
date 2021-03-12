package labAssignment;

public class CostOfConstr {
	public static void main(String[] args) {
		
	}
}

class House
{
	Door d = new Door();
	Window w = new Window();
	int areaOfConstOfDoor;
	int areaOfConstOfWind;
	public void costDoor()
	{
		Door d = new Door();
		System.out.println(d.costOfConsOfDoor(areaOfConstOfDoor));
	}
	public void costWind()
	{
		Window d = new Window();
		System.out.println(d.costOfConsOfWind(areaOfConstOfWind));
	}
}

class Door
{
	int costD = 0;
	public int costOfConsOfDoor(int areaOfDorr)
	{
		/**/
		return costD;
	}
}

class Window
{
	int costW = 0;
	public int costOfConsOfWind(int areaOfWind)
	{
		/**/
		return costW;
	}
}