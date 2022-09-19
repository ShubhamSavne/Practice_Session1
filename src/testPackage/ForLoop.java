package testPackage;

public class ForLoop 
{
	
	public static void main(String[] args) 
{
		// For Loop
		
		//*****
		//*****
		//*****
		//*****
			for (int i=1; i<5; i++)
			{
				for (int j=5; j>1; j--)
				{System.out.print("* ");}
				
			System.out.println();
			}
	{System.out.println("-----------------");}
			/*
			 *		*		1	1
			 *		**		2	2
			 *		***		3	3	
			 *		****	4	4
			 *		*****	5	5
			 *
			 */
			for (int i=1; i<=5; i++)
			{
				for (int j=1; j<=i; j++)
				{System.out.print("*");}
				{System.out.println();}
			}
	{System.out.println("-----------------");}
			/*
			 *		*****		5	1
			 *		****		4	2
			 *		***			3	3	
			 *		**			2	4
			 *		*			1	5
			 *
			 */
			for (int i=1; i<=5; i++)
			{
				for (int j=5; j>=i; j--)
				{System.out.print("*");}
				{System.out.println();}
			}
	{System.out.println("-----------------");}
	
		/*
				    *
				   * *
				  * * *
				 * * * *
				* * * * *
				
		*/
			for (int i=1; i<=7; i++)
			{
				for (int j=7; j>=i; j--)
				{System.out.print(" ");}
				for (int k=1; k<=i; k++)
				{System.out.print(" *");}
				System.out.println();
			}	
	{System.out.println("-----------------");}
			
	
/*	  * * * * * * *
	   * * * * * *
	    * * * * *
	     * * * *
	      * * *
	       * *
	        *
	        
*/
			for (int i=1; i<=7; i++)
			{
				for (int j=1; j<=i; j++)
				{System.out.print(" ");}
				for (int k=7; k>=i; k--)
				{System.out.print(" *");}
				System.out.println();
			}	
	{System.out.println("-----------------");}
			
	
			 		
	/*		* * * * * * 
			 * * * * * * 
			  * * * * * * 
			   * * * * * * 
			    * * * * * * 
			     * * * * * * 
			      * * * * * *	
	*/
	 		for (int i=1; i<=7; i++)
	 		{
	 			for (int j=1; j<i; j++)
 				{System.out.print(" ");}
	 			for (int k=7; k>=1; k--)
	 			{System.out.print("* ");}
	 		System.out.println(); 			
	 		}
	 {System.out.println("-----------------");}	
	 
	 
	 
	/*		     * * * * * * * 
			    * * * * * * * 
			   * * * * * * * 
			  * * * * * * * 
			 * * * * * * * 
			* * * * * * * 
			* * * * * * *
		*/
	 		for (int i=1; i<=7; i++)
	 		{
	 			for (int j=7; j>=i; j--)
 				{System.out.print(" ");}
	 			for (int k=1; k<=7; k++)
	 			{System.out.print("* ");}
	 			
	 		System.out.println(); 			
	 		}
	  {System.out.println("-----------------");}		
	  
	  
	  		
	 
	  
	  
	  
	  
}

}
