package arrayProgram;

import java.util.Scanner;

public class AvgTest
{
	
	public static void main(String[] args)
	{
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter 10 elements");
//		int el=sc.nextInt();
		for (int i = 0; i <arr.length; i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		float avg1=(float) (sum/arr.length);
		System.out.println("sum is:"+sum+" avg is:"+avg1);
		
		
	}

}
