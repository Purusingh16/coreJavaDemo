package localVariable;

public class Test 
{
	void fun()
	{
		int a;
		a=10;
		a++;
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		int a=100;
		Test t;
		t=new Test();
		t.fun();
		System.out.println(a);
	}

}
