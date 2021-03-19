package day9;

public class CustomException extends Exception {
	String str;
	public CustomException(String str)
	{
		this.str = str;
	}
	@Override
	public String toString()
	{
		return str;
	}
}
