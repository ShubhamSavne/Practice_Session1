package oops;

public class InterfaceClass2 implements InterfaceClass 
{
	
	public void raj3()
	{
		System.out.println("overhide from interface class");
	}
	

		public void raj2() 
	{
		System.out.println("override from interface 2");
	}
	
	public void raj()
	{
		System.out.println(" void method only from interface");
	}
		
	public static void main(String[] args) 
	{
	

	InterfaceClass2 b= new InterfaceClass2();
	b.raj();
	b.raj2();
	b.raj4();
	
	
	
	
}


}
