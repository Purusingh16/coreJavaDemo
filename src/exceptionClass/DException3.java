package exceptionClass;

import java.util.Scanner;

public class DException3 extends Exception
{
	static String msg;
	public DException3(String msg)
	{
//		this.msg=msg;
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter the EmpId");
		String empId=sc.nextLine();
		if(empId.length()!=4)//exception
		{
			throw new DException3("Invalid EmpId");
		}
		System.out.println("Enter the bsal");
		int bsal=sc.nextInt();
		if(bsal<5000)//exceptionT
		{
			throw new DException3("Invalid bSal");
		}
		System.out.println("EmpId="+empId+" "+bsal);
		}
		catch(DException3 ob)
		{
			System.out.println(ob.getMessage());
			System.out.println(ob);
		}
		
	}

}
