package typecasting;

public class Simple
{
	
	public static void main0(String[] args) 
	{
		int a=10;
		int b=10;
		int c=a+b;
		
		System.out.println(c);
	}
	public static void main1(String[] args)
	{
		int a=10;
		float f=a;
		System.out.println(a);
		System.out.println(f);
	}
	public static void main2(String[] args)
	{
		float f=10.5f;
		int a=(int) f;
		System.out.println(a);
	}
	public static void main3(String[] args)
	{
//		overflow
		int a=130;
		byte b=(byte) a;
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		byte a=10;
		byte b=10;
		
		byte c=(byte) (a+b);
		System.out.println(c);
		
	}

	


}
