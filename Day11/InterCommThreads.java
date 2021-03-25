package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterCommThreads {
	public static void main(String[] args) throws Exception {
		Gun gun = new Gun();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i = 0; i< 5; i++)
			{
				try
				{
				gun.fill();
				}catch(Exception e) {}
			}
		});
		es.execute(()->{
			for(int i = 0; i< 5; i++)
			{
				try
				{
				gun.shoot();
				}catch(Exception e) {}
			}
		});
		es.shutdown();
	}
}

class Gun
{
	boolean isFill;
	synchronized public void fill() throws Exception
	{
		if(isFill)
		{
			wait();
		}
		System.out.println("Gun Filled....");
		isFill = true;
		notify();
	}
	synchronized public void shoot() throws Exception
	{
		if(!isFill)
		{
			wait();
		}
		System.out.println("Shoot the target");
		isFill = false;
		notify();
	}
}