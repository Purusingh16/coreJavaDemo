package stringArray;

public class Demo 
{
	public static void main(String[] args) 
	{
		int arr[];
		arr=new int[1];
		arr[0]=99;
		arr[1]=98;
		System.out.println(arr[0]);//99
		System.out.println(arr[1]);
		change(arr);
		System.out.println(arr[0]);//12
	}
	static void change(int a[])
	{
		a[0]=12;
	}

}
