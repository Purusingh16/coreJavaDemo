package instanceVariable;

public class Test
{
	int x=10;
	public static void main(String[] args)
	{
//		System.out.println(x);//CE
		Test t=new Test();
		System.out.println(t.x);
	
	}
	public void m1()
	{
		System.out.println(x);
	}

}
