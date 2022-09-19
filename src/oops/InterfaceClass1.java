package oops;

import java.security.DomainCombiner;

public class InterfaceClass1 implements InterfaceClass
{

	public void raj()
	{
		System.out.println("overhide from class 1");
	}

	
	public void raj2() {
		System.out.println("aaa");
		
	
	}
	
public static void main(String[] args)
{
	
	InterfaceClass1 c = new InterfaceClass1();
	c.raj();
	c.raj2();
}	
}
