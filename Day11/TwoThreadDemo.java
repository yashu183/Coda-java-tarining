package day11;

public class TwoThreadDemo {
	public static void main(String[] args) {
		System.out.println("First line");
		//new Thread(()->{met();}).start();
		met();
		System.out.println("Third line...");
	}
	
	static void met()
	{
		try{Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("Second line....");
	}
}
