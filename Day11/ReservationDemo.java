package day11;
//one obj 2 threads 2 different tasks....
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ReservationDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Reservation r = new Reservation();
		es.execute(()->{
			Thread.currentThread().setName("Yashu");
			r.bookTkt(1000);
			r.returnChange();
		});
		es.execute(()->{
			Thread.currentThread().setName("Yashwanth");
			r.bookTkt(500);
			r.returnChange();
		});
		es.shutdown();
	}
}

class Reservation
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