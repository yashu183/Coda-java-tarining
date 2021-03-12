package labAssignment;

public class PBVproof {
	public static void ArrManuplation(int[] arr)
	{
		arr[2] = 2000;
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println("original");
		System.out.println(h.a+" "+h.f+" "+h.c+" "+h.s);
		System.out.println("after pbv passing each and every property seperately (primitive datatype)");
		PBV pbv = new PBV();
		pbv.fun(h.a, h.f, h.c, h.s);
		System.out.println(h.a+" "+h.f+" "+h.c+" "+h.s);
		System.out.println("after passing obj itself or non-primitive or user defined datatype");
		PBR pbr = new PBR();
		pbr.fun(h);
		System.out.println(h.a+" "+h.f+" "+h.c+" "+h.s);
		
		//array
		int[] arr = {1,2,3,4};
		System.out.println("arrays original");
		for(int i : arr)
		{
			System.out.print(i+"\t");
		}
		ArrManuplation(arr);
		System.out.println("after manuplation of arr...");
		for(int i : arr)
		{
			System.out.print(i+"\t");
		}
	}
}

class Hello
{
	int a = 10;
	float f = 1.83f;
	char c = 'c';
	String s = "Yashu";
}

class PBV
{
	public void fun(int a, float f, char c, String s)
	{
		a = 100;
		f = 2.3435f;
		c = 'y';
		s = "Yashwanth";
	}
}
class PBR
{
	public void fun(Hello h)
	{
		h.a = 100;
		h.f = 2.3435f;
		h.c = 'y';
		h.s = "Yashwanth";
	}
}