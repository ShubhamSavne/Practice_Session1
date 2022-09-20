package advance1;

public class Class1 
{
	public    static int a=10;
	          static int b=20;
	private   static int c=30;
	protected static int d=40;
	
	
	public      int p=10;
     			int q=20;
    private     int r=30;
    protected   int s=40;

	
	public static void s1()
	{System.out.println("Public static method Class1");}
	static void s2()
	{System.out.println("default static method Class1");}
	private static void s3()
	{System.out.println("private static method Class1");}
	protected static void s4()
	{System.out.println("protected static method Class1");}
	
	
	
public static void main(String[] args)
{
	System.out.println(a);	//public
	System.out.println(b);	//default
	System.out.println(c);	//private
	System.out.println(d);	//protected
	
	
System.out.println("****************************");
	
	
	Class1 x= new Class1();   //object
	
	System.out.println(x.p);	//public for non static variable
	System.out.println(x.q);	//default for non static variable
	System.out.println(x.r);	//private for non static variable
	System.out.println(x.s);	//protected for non static variable
	
System.out.println("****************************");
	
	
	Class1.s1();
	Class1.s2();
	Class1.s3();
	Class1.s4();	

System.out.println("change upload to the git hub");
System.out.println("change for send to the branch git hub");
}
	
	
}
