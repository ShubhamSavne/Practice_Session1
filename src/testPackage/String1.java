package testPackage;

public class String1
{
	public static void main(String[] args) 
	{
		
		String a="shubham";
		String b="shubham";
		
		String c= new String("shubham");
		String d= new String ("shubham");
		
//compare a memory location
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		b="pratik";
		System.out.println(a==b);
		
	
System.out.println("***************");

// compare a data
//equals

		System.out.println(c.equals(d)); //Case sensitive
		
System.out.println("**********");


//equalsIgnoreCase
		String e="SHUBHAM";
		
		System.out.println(a.equalsIgnoreCase(e));//not case sensitive
		
System.out.println("*************");
		
//toUpperCase
		String u=a.toUpperCase();
		System.out.println(u);
		
//toLowercase
		String l= u.toLowerCase();
		System.out.println(l);
		
		
System.out.println("*************");
//indexOf('') and LastIndexOf
		int m=a.indexOf('h');
		System.out.println(m);
		System.out.println(a.lastIndexOf('h'));
		
//charAt (index)
		char n= a.charAt(4);
		System.out.println(n);
		
System.out.println("*************");
//length	
		int o= a.length();
		System.out.println(o);
	
//startWith(" ")  case sensitive
		boolean p= a.startsWith("s");
		System.out.println(p);
		
//endswith(" ")  case sensitive
		boolean q= a.endsWith("M"); 
		System.out.println(q);
		
System.out.println("*************");

//Trim()  to eliminate unnecessary spaces
		String a2= "   Velocity   Class    ";
		String a3=a2.trim();
		System.out.println(a2);
		System.out.println(a3);
	
//SubString(" ") Length of string by giving just index value as a command
		
		String a4 =a2.substring(5, 18);
		System.out.println(a4);
		
		
System.out.println("*************");

//Concatenation
		String v1="Velocity";
		System.out.println(v1+" Testing");
		
		String v2= v1.concat(" Katraj").concat(" Pune").concat(a4);
		System.out.println(v2);
		String v3= v1+v2;
		System.out.println(v3);
		
System.out.println("*************");		
//Split ()
		String v4="Velocity class katraj pune";
		String y1[]= v4.split(" ");
		System.out.println(y1[2]+" "+y1[0]);
		
		
		
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
