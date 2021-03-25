package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PesimisticLock_ObjectLock {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Reservation1 r = new Reservation1();
		es.execute(()->{
			Thread.currentThread().setName("Yashu");
			synchronized(r) {
			r.bookTkt(1000);
			r.returnChange();
			} 
		});
		es.execute(()->{
			Thread.currentThread().setName("Yashwanth");
			synchronized(r) {
			r.bookTkt(500);
			r.returnChange();
			}
		});
		es.shutdown();
	}
}

class Reservation2
{
	int amt;
	//Thread t = Thread.currentThread();
	public void bookTkt(int amount)
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		amt = amount;
		System.out.println("Ticket is booked by : "+name);
		System.out.println("Amount paid by "+name+" : "+amt);		
	}
	public void returnChange()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();
		//System.out.println("Ticket is booked by : "+name);
		amt = amt - 100;
		System.out.println("Amount paid to "+name+" : "+amt);
	}
}