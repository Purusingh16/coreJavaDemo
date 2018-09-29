package staticVariable;

public class Test 
{
	static int x=10;
	public static void main0(String[] args) 
	{
		Test tt=new Test();
		System.out.println(tt.x);//object reference
		System.out.println(Test.x);//class name
		System.out.println(x);//directly
		
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		m1();
	}
	public static void m1()
	{
		System.out.println(x);
	}

}
