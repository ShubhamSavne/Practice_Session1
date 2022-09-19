package testPackage;

public class ControlStatement
{
	public static void main(String[] args) 
{
	int a=10;
	if (a>10)   //true   
	{
		System.out.println("a is greater than or equal to 10");
	}
	else    //false
	{
		System.out.println("a is smaller than 10");
	}
	
	
	int z=30;
	float y=366.85f;
	double x=((z*y)*6)%2/(2*((z*y)*6));
	System.out.println(x);
	
							// If else
	
	if ((2*x)>=((z*y)*6)%2/(2*((z*y)*6)))
	{
		System.out.println("xis less than 66033.0");
	}
	
	else
	{
		System.out.println("xis greater than 66033.0");
	}
	
	
	
							// Ladder If else
	
	int marks =45;
	if (marks>75)
	{
		System.out.println("take admission sci");
	}
	else if (marks>60)
	{
		System.out.println("take admission com");
	}
	else  if (marks>35)
	{
		System.out.println("take admission art");
	}
	
	else 
	{
		System.out.println("fail");
	}
	
	float hydraulic_jump=2.7f;
		if (hydraulic_jump>9)
			{
				System.out.println("strong jump");
			}
		else if  (hydraulic_jump>4.56)
			{
				System.out.println("steady jump");
			}
			
		else if  (hydraulic_jump>2.5)
			{
				System.out.println("oscillating jump");
			}
		else if  (hydraulic_jump>1.7)
			{
				System.out.println("weak jump");
			}
		else if  (hydraulic_jump>1)
			{
				System.out.println("undular jump");
			}
		else 
		{
			System.out.println("No jump");
		}
		
		
							// Nested If else
		
		marks=92;
		if (marks>75)
		{
			//sci
			if (marks>90) 
			{
				if (marks>98)
				{System.out.println("Topper Sci Div A");}
				else {System.out.println("Brillient sci Div A");}
			}
			else if (marks>80)
			{
				System.out.println("sci Div B");
			}
			else
			{
				System.out.println("sci Div C");
			}
		}
		else if (marks>60)
		{
			//com
			if (marks>70) 
			{
				System.out.println("comm. Div A");
			}
			else if (marks>65)
			{
				System.out.println("Comm. Div B");
			}
			else
			{
				System.out.println("Comm. Div C");
			}
		}
		else if (marks>35)
		{
			//Art
			if (marks>50) 
			{
				System.out.println("Art Div A");
			}
			else if (marks>40)
			{
				System.out.println("Art Div B");
			}
			else
			{
				System.out.println("Art Div C");
			}
		}
		else
		{
			System.out.println("Try next Year thank you");
		}
		
		
		
		
}	
	
}
