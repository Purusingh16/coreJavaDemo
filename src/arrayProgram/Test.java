package arrayProgram;

public class Test 
{

	public static void main(String[] args) 
	{
//		step-1 array declaration
		int arr[];
//		step-2 array construction
		arr=new int[1];
//		step-3 array initialization
		arr[0]=56;
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
	}
	static void change(int[] a)
	{
		a[0]=99;
	}

}
