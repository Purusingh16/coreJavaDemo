package arrayProgram2;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		Emp e1=new Emp(111,"ratan");
		Emp e2=new Emp(222,"dipu");
		Emp e3=new Emp(333,"singh");
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for (Emp emp : al)
		{
			System.out.println(emp.eid+"---"+emp.name);
		}

	}

}
