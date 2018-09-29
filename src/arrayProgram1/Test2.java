package arrayProgram1;

public class Test2 {

	public static  void main(String[] args) 
	{
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
//		a[3]=40;
		for (int aa : a) 
		{
			System.out.println(aa);
		}
		boolean[] b=new boolean[3];
		for (boolean bb : b)
		{
			System.out.println(bb);
		}
		Test[] t=new Test[3];
		for (Test test : t) 
		{
			System.out.println(test);
		}
		
	}

}
