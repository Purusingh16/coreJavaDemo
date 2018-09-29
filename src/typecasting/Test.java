package typecasting;

public class Test
{
//	static final int a=1000;
	public static void main8(String[] args)
	{
		byte b=10;
		int i=b;
		long l=i;
		float f=l;
		System.out.println(b+"\t"+i+"\t"+l+"\t"+f);
	}
	public static void main(String[] args)
	{
		int i=132;
		byte b=(byte) i;
		System.out.println(b);
	}
	public static void main2(String[] args)
	{
		final int i=10;
			byte b=i;
			System.out.println(b);
	}
	/*public static void main4(String[] args)
	{
		System.out.println(Test.a);
		
	}*/

}
