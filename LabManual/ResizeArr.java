package labAssignment;

public class ResizeArr {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5; //works fine...
		// now we are trying to assign 6th integer..
		arr[5] = 65; //index out of bound error
		for(int i: arr)
		{
			System.out.println(i);
		}
		//now trying to resize the same array..
		//int arr[] = new int[6]; // aleady declaed error duplicate var err
		//so cant resize the arr
	}
}
