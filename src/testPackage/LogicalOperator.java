package testPackage;

public class LogicalOperator 
{
	public static void main(String[] args)
	{
	
		boolean a= true;
		boolean b=false;
		
	// And(&&)
		boolean r=(5<6) && (5>7);
		System.out.println(r);
		
	// OR (||)
		
		r=a||b;
		System.out.println(r);
		
		r= (7==10)||(7==7);
				System.out.println(r);
				
	// NOT (!)
		boolean t=!false;
		System.out.println(t);
		
		int x=25;
		int y=25;
		boolean z= y!=x;
		System.out.println(z);
	}

}
