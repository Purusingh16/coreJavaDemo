package arrayProgram;

import java.util.Scanner;

public class Demo2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[];
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Initialize the array element");
		for (int i = 0; i < size; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nsee array element");
		for (int i = 0; i < size; i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}

}
