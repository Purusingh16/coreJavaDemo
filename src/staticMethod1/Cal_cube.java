package staticMethod1;

public class Cal_cube 
{
	static int cube(int x)
	{
		return x*x*x;
	}

	public static void main(String[] args) 
	{
		int result=Cal_cube.cube(5);
		System.out.println(result);
	}

}
