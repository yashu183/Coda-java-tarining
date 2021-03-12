package labAssignment;

public class Singleton {
	public static void main(String[] args) {
		SingletonClass sc = new SingletonClass();
		SingletonClass sc1 = new SingletonClass();
		SingletonClass sc2 = new SingletonClass();
	}
	static class SingletonClass
	{
		static int count = 0;
		public SingletonClass()
		{
			count++;
			System.out.println("const called");
			System.out.println(count);
		}
	}
}
