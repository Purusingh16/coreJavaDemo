package arrayProgram;

public class UpdateArrayTest 
{

	public static void main(String[] args) 
	{
		double[] arr={2,3,3.4,4.5};
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		updateArray(arr);
		System.out.println(arr[0]);
		
	}
	public static void updateArray(double[] a)
	{
		a[0]=99;
	}

}
