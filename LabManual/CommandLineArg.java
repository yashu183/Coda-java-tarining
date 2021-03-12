package labAssignment;

public class CommandLineArg {
	public static void main(String[] args) {
		System.out.println("printing command line arguements.....");
		if(args.length == 0)
			System.out.println("No command line arguements given");
		else
			for(int i = 0; i <args.length; i++)
			{
				System.out.println(args[i]);
			}
	}
}
