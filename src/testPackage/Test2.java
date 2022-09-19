package testPackage;

public class Test2 
{
	public static void main(String[] args)
{
		int a=20;
		int b=150;
		int c=905;
		int d=500;
		int e=200;
		//Concatenation means join two different data type (string + variable) 
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					if (a>e)
					{System.out.println("a is greater=" +a);}
					else 
					{System.out.println("e is greater=" +e);}
				}	
				else 
				{
					if (d>e)
					{System.out.println("d is greater=" +d);}
					else 
					{System.out.println("e is greater=" +e);}	
				}
			}
			else		
			{
				if (c>d)
				{
					if (c>e)
					{System.out.println("c is greater=" +c);}
					else 
					{System.out.println("e is greater=" +e);}
				}	
				else 
				{
					if (d>e)
					{System.out.println("d is greater=" +d);}
					else 
					{System.out.println("e is greater=" +e);}		
				}	
			}
		}
			
		else
		{
			if (b>c)
			{
				if (b>d)
				{
					if (b>e)
					{System.out.println("b is greater=" +b);}
					else 
					{System.out.println("e is greater=" +e);}
				}	
				else 
				{
					if (d>e)
					{System.out.println("d is greater=" +d);}
					else 
					{System.out.println("e is greater=" +e);}	
				}
			}
			else		
			{
				if (c>d)
				{
					if (c>e)
					{System.out.println("c is greater=" +c);}
					else 
					{System.out.println("e is greater=" +e);}
				}	
				else 
				{
					if (d>e)
					{System.out.println("d is greater=" +d);}
					else 
					{System.out.println("e is greater=" +e);}		
				}	
			}
			
			
		}	
	
		
		System.out.println("--------------------------------------");


if  ((a>b) && (a>c) && (a>d) && (a>e))
	{System.out.println("largest of five is A");}
	else if ((b>a) && (b>c) && (b>d) && (b>e))
	{System.out.println("largest of five is B");} 
	else if ((c>b) && (c>b) && (c>d) && (c>e))
	{System.out.println("largest of five is C");}
	else if ((d>a) && (d>b) && (d>c) && (d>e))
	{System.out.println("largest of five is d");}
	else if ((e>a) && (e>b) && (e>c) && (e>d))
	{System.out.println("largest of five is E");}







}
	

}
