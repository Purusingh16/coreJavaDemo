package exceptionClass;

import java.util.Scanner;

public class DException2 extends Exception
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		try
		{
		System.out.println("Enter the rNo:");
		String rNo=sc.nextLine();
		if(rNo.length()!=10)//Exception raised
		{
			throw new DException2();
		}
		System.out.println("rNo:"+rNo);
		break;//stop the loop
		}//end of try block
		catch(DException2 ob)
		{
			System.out.println("Invalid rollNumber");
		}
		}//end of while loop
	}

}
