package practice1;

public class Armstrongno 
{
	public static void main (String[] args) 
	{
		
		int a=371;
		
		
		int rem=0;
		int result=0;
		int b=a;
		
		while (a>0)
		{
			rem = a%10;		//1;7;3
			a=a/10;			//37;3;0
			
			result =result+(rem*rem*rem);
					//0+1=1
					//1+(7*7*7)=344
					//344+(3*3*3)=371		
		}
		
		if (b==result)
		{System.out.println("it is a armstrong number");}
		else
			{System.out.println("it is not a armstrong number");}
		
		
		
		
		
		
		
		
		
	}

}
