package practice1;

public class AscendingDecending 
{
	
	
public static void main(String[] args)
{
			
			int a [] = {201,150,200,300,500,1000,1500,1300,1200};
			
			for (int i=0;i<a.length;i++)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]>a[j])
					{
						int x=a[i];
						a[i]=a[j];
						a[j]=x;
								
					}	
				}
					{System.out.print(a[i]+" ");}
			
			}
			
			
	System.out.println();	
	System.out.println("*************************************");	
			
		
		
		for (int i=0;i<a.length;i++)
		    {
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]<a[j])
				{
					int x=a[i];
						a[i]=a[j];
						a[j]=x;
				}
			}
		 
			{System.out.print(a[i]+" ");}
		    }
			
					
		
			
}
	

}
