package testPackage;

public class CastingMain 
{
	
	public static void main(String[] args) 
	{
		
		Casting1 sup = new Casting1();
		sup.arthmatic();
		sup.caststatic();
		
		Casting2 sub = new Casting2();
		sub.arthmatic();
		sub.caststatic();
		
		
		Casting1 cast = new Casting2();
		cast.arthmatic();
		cast.caststatic();
		
		
	}

}
