package blocks;

public class Test 
{
	static int i;
	static 
	{
		i+=10;
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		i*=2;
		System.out.println(i);
	}
	static 
	{
		i*=5;
		System.out.println(i);
	}

}
