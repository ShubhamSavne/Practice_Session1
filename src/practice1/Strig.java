package practice1;

import java.util.Scanner;

public class Strig 
{
	public static void main(String[] args) 
	{
		
		//Scanner a= new scanner(System.in);
		//System.out.println("Enter the String");
		//String b=a.nextLine();
		
		
		String g=" good evening guys ";
		String reverse=" ";
		
		for (int i=g.length()-1; i>=0; i--)
		{
			reverse = reverse + g.charAt(i);
		}	
				// " "
				// " "+ s
				// " " +s+y
		
		System.out.println(reverse);
		
		
		System.out.println(g.length());
		
		
//count of string without space
		
		String h= "my name is shubham";
		int count =0;
		for (int f=0; f<h.length();f++)
		{
		if (h.charAt(f)!= ' ')
			count++;
		}
		System.out.println(count);
	
//count of string without space Second method
		String x="my name is shubham";
		 String y= x.replace(" ", "");
		 System.out.println(y.length());
		
		
		
	}
	
	
}
