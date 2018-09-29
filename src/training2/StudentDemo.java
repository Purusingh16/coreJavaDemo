package training2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDemo 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int rno,no,nostud;
		String name;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter How many Students:=> ");
		nostud=Integer.parseInt(br.readLine());
		Student s[]=new Student[nostud];

		for(int i=0;i<nostud;i++)
		{
		System.out.println("Enter Roll Number:=> ");
		rno=Integer.parseInt(br.readLine());
		System.out.println("Enter Name:=> ");
		name=br.readLine();
		System.out.println("Enter No of Subject:=> ");
		no=Integer.parseInt(br.readLine());
		s[i]=new Student(rno,name,no);
		}
		for(int i=0;i<nostud;i++)
		{
		s[i].calculateMarks();
		}

		
	}

}
