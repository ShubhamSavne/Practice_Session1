package advance2;

import advance1.Class1;

public class Class3 extends Class1  //inheritance
{

	public static void main(String[] args)
	{
		System.out.println(Class1.a);	//public
		//System.out.println(Class1.b);	//default
		//System.out.println(Class1.c);	//private
		System.out.println(Class1.d);	//protected  inheritance extends Class1

System.out.println("****************************");
		
		Class1 x= new Class1();   //object
		Class3 y= new Class3();   //object only for protected non static variable
									//due to inheritance
		
		System.out.println(x.p);	//public for non static variable
		//System.out.println(x.q);	//default for non static variable
		//System.out.println(x.r);	//private for non static variable
		System.out.println(y.s);	//protected for non static variable object 
									//only for protected non static variable due to inheritance
		
		System.out.println("****************************");
		
		Class1.s1();
		//Class1.s2();
		//Class1.s3();
		Class1.s4();		//protected  inheritance extends Class1

		
		
		
}

}
