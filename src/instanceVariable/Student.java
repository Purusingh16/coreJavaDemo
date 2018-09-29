package instanceVariable;

public class Student 
{
	String name;
	int roll;
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setRoll(int r)
	{
		roll=r;
	}
	public int getRoll()
	{
		return roll;
	}

	public static void main(String[] args) 
	{
		Student ss=new Student();
		ss.setName("Ankit");
		ss.setRoll(101);
		System.out.println("Name is:"+ss.getName()+"\t Roll number is:"+ss.getRoll());
		
		Student s=new Student();
		System.out.println("Name is:"+s.getName()+"\t Roll number is:"+s.getRoll());
		
		
		
	}

}
