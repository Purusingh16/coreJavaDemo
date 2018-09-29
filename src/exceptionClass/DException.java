package exceptionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DException 
{

	public static void main(String[] args) 
	{
		while(true)
		{
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the val");
			int x=sc.nextInt();
			int k=44/x;//when x==0 exception raised
			System.out.println("val of k:"+k);
			break;//stop the while loop execution
		}//end try block
		catch(ArithmeticException | InputMismatchException ae)
		{
			System.out.println("only non-zero integer value");
			System.out.println(ae);
			System.out.println("exception details :"+ae.getMessage());
		}
		/*catch(InputMismatchException ie)
		{
			System.out.println("only integer value");
		}*/
	}//end of while loop
	}
}
