package arrayProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student
{
	String name,add;
	int roll;
}
public class Demo3 
{
	public static void main(String[] args)
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		Student ss[];
		System.out.println("Enter the size of an array");
		try {
			int size=Integer.parseInt(br.readLine());
			ss=new Student[size];
			System.out.println("\nEnter student information");
			for (int i = 0; i < size; i++)
			{
				ss[i]=new Student();
				ss[i].name=br.readLine();
				ss[i].roll=Integer.parseInt(br.readLine());
				ss[i].add=br.readLine();
			}
			System.out.println("\nsee Student Information");
			for (int i = 0; i < size; i++) 
			{
				System.out.println(ss[i].name);
				System.out.println(ss[i].roll);
				System.out.println(ss[i].add);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
