package testPackage;

public class Test
{
	public static void main(String[] args)
{
	int a=270;
	int b=150;
	int c=350;
	int d=500;
	//Concatenation means join two different data type (string + variable) 
	
	if (a>b)
	{
		if (a>c)
		{	if (a>d)
			{System.out.println("a is greater=" + a);}
			else 
			{System.out.println("d is greater=" + d);}
		}
		else
		{	if (c>d)
			{System.out.println("c is greater=" + c);}
			else 
			{System.out.println("d is greater=" + d);}	
		}
	}
	else
	{
		if (b>c)
		{	if (b>d)
			{System.out.println("b is greater=" + b);}
			else 
			{System.out.println("d is greater=" + d);}
		}
		else
		{	if (c>d)
			{System.out.println("c is greater=" + c);}
			else 
			{System.out.println("d is greater=" + d);}	
		}
	}
		
}
}