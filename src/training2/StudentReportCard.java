package training2;

import java.util.Scanner;

public class StudentReportCard 
{

	public static void main(String[] args)
	{
		/*System.out.println(args.length);
		if(args.length>0)
		System.out.println(args[0]);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your college name");
		String cname=sc.next();
		System.out.println("Enter total subjects");
		int subject=sc.nextInt();
		
		System.out.println("Name:"+name+" CName:"+cname+"Subject:"+subject);
		
		
		
	}

}
