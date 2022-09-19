package oops;

public abstract  class AbstractClass
{
	
	public abstract void raj();
	
	public static void raj2()
	{
		System.out.println("static method");
	}

	public void raj3() 
	{
		System.out.println("nonstatic method");
		
	}
	
	public static void main(String[] args)
	{
		raj2();
	//	AbstractClass a= new AbstractClass; we cant able to create a object of abstract class
	//	a.raj();
	//	a.raj3();
		
	}
}
