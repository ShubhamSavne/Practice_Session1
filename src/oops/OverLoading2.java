package oops;

public class OverLoading2 extends OverLoading1
{
	
	public void Class()
	{
		System.out.println("Hello World 2");
	}
	
	
	public static void main(String[] args) 
	{
		
		OverLoading2 b= new OverLoading2();
	
		OverLoading1 c = new OverLoading1();
		c.Class();
		b.Class();
	
	
	
	
	
	
	
	}
	

}
