package day6;

public class InnerClassDemo {
	public static void main(String[] args) {
		//Cola campacola = new CampoCola(); //causes prblm because campocola is inside kalimark
		Pepsi pepsi = new Pepsi();
		Kalimark kalimark = new Kalimark();
		
		//Cola campocola = new Kalimark().new CampoCola(); //inner cls obj can be created using outrer cls obj
		//Cola campocola = new Kalimark().trojan();
		//pepsi.setCola(campocola);
		//kalimark.setCola(campocola);
		kalimark.sellBovontoCola();
		pepsi.sellPepsiCola();
		
	}
}

//abstract class Cola
//{
//	public abstract void makeCola();
//}

interface Cola
{
	public void makeCola();
}


class Pepsi
{
	Cola cola;
	public void setCola(Cola cola)
	{
		this.cola = cola;
	}
	public void sellPepsiCola()
	{
		//pepsi purchase campocola
		cola.makeCola();
		System.out.println("Pepsi Cola is ready");
	}
}

class Kalimark
{
	Cola cola;
	public void setCola(Cola cola)
	{
		this.cola = cola;
	}
	
	public static void makeBovontoCola()
	{
		System.out.println("Logic copied from CampoCola and cola is ready....");
	}
	
	public void sellBovontoCola()
	{
//		class CampoCola extends Cola //local inner class (cls defined inside a fun)
//		{
//			public void makeCola()
//			{
//				System.out.println("CampoCola makes cola.....");
//			}
//		}
		
		//merging
		//anonymous inner cls (three types 1.anonymous 2.Method referencing b3.lambda)
		
		//1.anonymous//also works with interface
		new Cola() {
			
			@Override
			public void makeCola() {
				// TODO Auto-generated method stub
				System.out.println("CampoCola makes cola.....");
			}
		}.makeCola();
		
		//2.Method Referencing
	//	Cola cola = Kalimark::makeBovontoCola; //works only with interfaces
		
		
		//3. lambda function //works only with interfaces
		Cola cola =()->{
			System.out.println("cola logic copied to  create cola using lambda");
		};
		//setCola(new CampoCola());
		//pepsi purchase campocola
		cola.makeCola();
		System.out.println("Bovonto cola is ready");
	}
	
	
//	public Cola trojan()
//	{
//		return new CampoCola();
//	}
	
}