package practice1;

public class ForLoop
{
	
	public static void main(String[] args)
{
System.out.println("print even number");
		
		for (int i=0; i<=20; i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
		
System.out.println("**************");	
		System.out.println("print odd number");
		for (int i=0; i<=20; i++)
		{
			if (i%2!=0)
				System.out.println(i);
		}
			
System.out.println("**************");		
		System.out.println("print straight number");	
		for (int i=0; i<=10; i++)
		{
				System.out.println(i);
		}


System.out.println("**************");		
		System.out.println("print reverse number");	
		for (int i=10; i>=0; i--)
		{
				System.out.println(i);
		}	
		
		
		 for (int i=1; i<=6; i++)
		  {
			  for (int j=1; j<i; j++)
			  {System.err.print(" ");}
			  for (int k=6; k>=0; k--)
			  {System.out.print("*");}
			  System.out.println();
		  }
		
		 for (int i=1; i<=6; i++)
		  {
			  for (int j=i; j>=1; j--)
			  {System.out.print(" ");}
			  for (int k=1; k<=6; k++)
			  {System.out.print("*");}
			  System.out.println();
		  }
		
 System.out.println("**************");	
	System.out.println("Fibonacci series");
		 int a=0;
		 int b=1;
		 int sum;
		 System.out.println(a+" "+b);
		 for (int c=2; c<10; c++)
		 { sum =a+b;
		 System.out.println(" "+sum);
		 a=b;
		 b=sum;
		 }
}
	
}
