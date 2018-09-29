package arrayProgram1;

import java.util.Scanner;

public class Input {

	public static void main(String[] args)
	{
		int r,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number of row");
		r=s1.nextInt();
		System.out.println("Enter number of column");
		c=s1.nextInt();
		int arr[][];
		arr=new int[r][c];
		System.out.println("\n initialize the element of an array");
		
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				arr[i][j]=s1.nextInt();
			}
		}
		System.out.println("\n see the element of an array.\n");
		for (int i = 0; i < r; i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				System.out.println(arr[i][j]+"\n");
			}
			System.out.println("\n");
		}
	}

}
