package labAssignment;

public class TypeCasting {
	public static void main(String[] args) {
		int i = 1;
		float f = 1.893f;
		char c = 'c';
		String s = "yashwanth";
		boolean isP = true;
		byte b = 2;
		long l = 100089;
		double d = 1099.345;
		//assigning them to each other
		//i = f; //cant assign float to int implicitly
		f  = i; // can assign int to float explicitly
		System.out.println("after implicit type casting int --> float "+f);
		//c = s; // cant assign string to char
		//s = c; // cant convert cahr to string
		// = i; // cant convert int to string
		//s = f; // cant convert float to string
		i = b; // can convert byte to int
		//b = i; // cant convert int to byte
		//i = l; // cant convert long to int
		l = i; // can convert int to long
		f = b; // can convert byte to float 
		f = l; // can convert long to float
		d = f; // can convert float to double
		//f = d; // cant convert double to float
		
		//explicit ty[pe conversion..
		
		//double to byte
		b = (byte)d; // possible
		System.out.println(b);
		//double to float
		f = (float)d;
		System.out.println(f);
	}
}
