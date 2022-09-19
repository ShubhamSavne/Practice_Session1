package oops;

public class AbstractClass2 extends AbstractClass
{
	
	public  void raj()
	{
		System.out.println("Abstract method");
	}
	
	public static void main(String[] args) 
	{
		
//		AbstractClass a= new AbstractClass; we cant able to create a object of abstract class anywhere
		//	a.raj();
		//	a.raj3();
		
		AbstractClass2 b= new AbstractClass2();
		b.raj();
		b.raj3();
	}
	
	

}
