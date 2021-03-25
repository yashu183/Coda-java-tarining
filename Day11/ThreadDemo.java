package day11;

public class ThreadDemo {
	public class ThreadDemoSample
	{
		public ThreadDemoSample()
		{
			//using Thread class...
			Thread t = new Thread(new ThreadWork());
			t.start();
			
			//executable frame work
		}
	}
	public static void main(String[] args) throws Exception{
		//new ThreadDemo().ThreadDemoSample();
		new ThreadDemo().new ThreadDemoSample();
		Thread t = Thread.currentThread();
		t.setName("Yashu");
		t.setPriority(9);
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			t.sleep(1000);
			
		}
		System.out.println(t);
	}
	public class ThreadWork implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Child demo worked...!!");
		}
		
	}
}
