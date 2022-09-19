package testPackage;

import java.util.Scanner;

public class ArmstrongNumber 
{
	
	/* Armstrong number		1. 153/10=15 ,	153%10= 3 rem
	 * 153= 1^3+5^3+3^3		2. 15%10=5 rem, 15/10=1
	 * 153= 1+125+27		3. 1%10=1 rem,	1/10=0
	 * 
	 * 153%10=3reminder
	 */

	public static void main(String[]args )
	{
		Scanner s= new Scanner(System.in);
		int a1= s.nextInt();
		
	//	int a1=154;
		int a=a1;
		int rem=0;
			
		int addResult=0;	//27
		
		while (a!=0)
		{
			rem= a%10; //3,5,1
			a= a/10;	//15,1,0
			
			addResult=addResult+ (rem*rem*rem);	//27+125=152+1
			//1 
				
		}
		
		if (a1==addResult)
		{
			System.out.println(a1+"is a armstrong number");
			
		}
		
		else {
			System.out.println(a1+"is not a armstrong number");
		}
	}
	
	
	
}
