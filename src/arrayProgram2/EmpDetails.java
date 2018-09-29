package arrayProgram2;

public class EmpDetails 
{

	public static void main(String[] args) 
	{
		Emp e1=new Emp(111,"Puru");
		Emp e2=new Emp(222,"Dipu");
		Emp e3=new Emp(333,"Singh");
		
		Emp[] emp=new Emp[5];
		emp[0]=e1;
		emp[2]=e2;
		emp[4]=e3;
		
		for (Object o : emp)
		{
			if (o instanceof Emp)
			{
				Emp ee=(Emp)o;
				System.out.println(ee.eid+"----"+ee.name);
			}
			if(o==null)
			{
				System.out.println(o);
			}
			
		}
		/*for (Emp emp2 : emp)
		{
			System.out.println(emp2.eid+"----"+emp2.name);
		}*/
		
		
	}

}
