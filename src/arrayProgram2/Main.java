package arrayProgram2;

public class Main 
{

	public static void main(String[] args)
	{
		Object[] o=new Object[3];
		o[0]=new Emp(111,"depak");
		o[1]=new Stud(101,"Dipu");
		o[2]=new Integer(10);
		
		for (Object object : o) 
		{
			if(object instanceof Emp)
			{
				Emp e=(Emp)object;
				System.out.println(e.eid+"----"+e.name);
			}
			if(object instanceof Stud)
			{
				Stud s=(Stud)object;
				System.out.println(s.eid+"---"+s.sname);
			}
			if(object instanceof Integer)
			{
				System.out.println(object);
			}
		}
		
	}

}
