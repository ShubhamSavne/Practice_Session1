package practice1;

public class Array 
{

public static void main(String[] args) 
{
		//array declaration by lateral
		//index	   0  1  2  3  4  5
		int a[]= {10,20,30,40,50,60};
		
		int size =a.length;
		System.out.println(size);
		
		
System.out.println("***********************************");
		
		for (int i=0; i<a.length; i++)
		{System.out.println(a[i]);}
System.out.println("***********************************");
					
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[5]);
		 System.out.println(a[3]);
		 System.out.println(a[4]);
		 System.out.println(a[2]);
System.out.println("***********************************");
	
		System.out.println("Duplicate number print");	
		int b[]= {1,2,3,5,4,8,4,5,3,2,1};
		for (int x=0; x<b.length; x++) 
		{
			for (int y=x+1; y<b.length; y++)
			{
				if (b[x]==b[y])
				{System.out.println(b[x]);}
			}
		}
			
System.out.println("***********************************");

		System.out.println("Reverse number print");
		int c[]= {5,6,7,8,9,1,2,3};
		for (int x=(c.length-1); x>=0; x--)
		{System.out.println(c[x]);}
		
System.out.println("***********************************");		
		
		System.out.println("even number print");
		
		int d[]= {19,8,7,6,5,4,3,2,1,11,12};
		for (int x=0; x<(d.length); x++)
		{
			if (d[x]%2==0)
			{System.out.println(d[x]);}
		}
		System.out.println("odd number print");
			
		for (int x=0; x<(d.length); x++)
		{
			if (d[x]%2!=0)
			{System.out.println(d[x]);}
		}
		
}	
}
