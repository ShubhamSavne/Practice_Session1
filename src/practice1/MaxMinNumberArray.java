package practice1;

public class MaxMinNumberArray 
{
	
	public static void main(String[] args)
	{
		//max no arry
		int a[]= {15,2,5,50,70,65};
		int max =a[1];
		for (int i=0;i<a.length;i++)
		{
			if (max<=a[i])
			{
				max=a[i];	
			}
		}
		
		System.out.println(max);
		
		
	System.out.println("****************************************");
		
		//min no array
		
		int b[]= {15,2,5,50,70,65};
		int min =a[1];
		for (int i=0;i<b.length;i++)
		{
			if (min>=a[i])
			{
				min=a[i];	
			}
		}
		
		System.out.println(min);
		
		
		
	}
}



