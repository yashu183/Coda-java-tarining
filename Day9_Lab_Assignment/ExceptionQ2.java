package day9_lab;

public class ExceptionQ2 {
	public void mth1()
	{
		mth2();
		System.out.println("Caller.....");
	}
	public void mth2()
	{
		try
		{
			//throw new Exception();
			//return;
			//System.exit(0);
		}catch(Exception e) {
			System.out.println("Catch-Mth-2");
			System.out.println(e);
		}finally{
			System.out.println("Finally - Mth - 2");
		}
	}
	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.mth1();
//		//s.mth2();
		ExceptionQ2 e = new ExceptionQ2();
		e.mth1();
	}
}

//class Sample
//{
//
//}