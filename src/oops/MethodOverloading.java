package oops;

public class MethodOverloading 
{
	
	static int a;
	static int b;
	static int c;
	
	public static void add(int a, int b)
	{
		c= a+b;
				
	}
	public static void add(int a)
	{
		a=6;
		b=90;
		
		c= a+b;
		System.out.println(c);
				
	}
	public static void main(String[] args) 
	{
		add(5,10);
		System.out.println(c);
		add (5);
	}
}
