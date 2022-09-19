package practiceRohan;

public class Array
{
	public static void main(String[] args) {
		
		
		
		
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=a[i]; j<a.length; j++)
			{
				
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{System.out.println("prime number ="+a[i]);}
			else
			{System.out.println("not a prime number= "+a[i]);}
		}
		
		
		
		
		
		//Duplicate array
		
		
		
		
		//Decending no.from order
		
		
		int x[]= {10,2,5,75,3,65,71,0,54};
		int temp=0;
		for(int i=0; i<x.length; i++)
		{
			for (int  j=i+1; j<x.length; j++)
			{
				if (x[i]<x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
			System.out.println(temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
