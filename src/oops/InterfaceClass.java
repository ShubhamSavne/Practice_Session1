package oops;

public interface InterfaceClass 
{
	
	void raj();				//public abstract
				// public static final
	
	public void raj2();
	
	
	public static void raj3()		//public static
	{
		System.out.println("static method interface");
	}

	
	default void raj4()			////public default nonstatic
	{
		System.out.println("default method interface");
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("we can declare main method in interface");
		raj3();
	//	InterfaceClass a= new InterfaceClass(); we can not able to create a object
	
	}
}
