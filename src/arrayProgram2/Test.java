package arrayProgram2;

public class Test 
{
	int[] m1()
	{
		System.out.println("m1 Method");
		int[] a={10,20,30};
		return a;
	}
	void m2(double[] d)
	{
		System.out.println("m2 Method");
		for (double dd : d) 
		{
			System.out.println(dd);
		}
	}

	public static void main(String[] args) 
	{
		Test t=new Test();
		int[] x=t.m1();
		for (int xx : x)
		{
			System.out.println(xx);
		}
		double[] d={10.4,29.7,29.0};
		t.m2(d);

	}

}
