package testPackage;

public class MethodPractice 
{
		static int a=50;
		int b=30;
		
		public static void StaticMethod()
		
		{System.out.println("Static method of class practice");}

		public void NonStaticMethod()
		{System.out.println("Non Static method of class practice");}
		
	public static void main(String[] args)
	{
		System.out.println(a);
		
		MethodPractice x= new MethodPractice ();
		
		x.a=20;		
		System.out.println(x.a);
		
		x.b=10;
		System.out.println(x.b);
		
		MethodPractice y= new MethodPractice ();
		
		y.a=200;
		System.out.println(y.a);
		
		y.b=100;
		System.out.println(y.b);
		
		
	}


}
