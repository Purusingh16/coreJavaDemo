package objectClass;

public class Student implements Cloneable
{
	String name;
	int roll;
	double fee;
	
	public Student(String name,int roll,double fee)
	{
		this.name=name;
		this.roll=roll;
		this.fee=fee;
	}

	public static void main(String[] args) 
	{
		Student ss=new Student("binod",20,238.90);
		try {
			Student aa=(Student) ss.clone();
			System.out.println(ss.name+"\t"+ss.roll+"\t"+ss.fee);
			System.out.println(aa.name+"\t"+aa.roll+"\t"+aa.fee);
			System.out.println(ss.hashCode()+"\t"+ss.hashCode());
			
			if (ss.equals(aa))
			{
				System.out.println("equals");
			} 
			else 
			{
				System.out.println("not equals");
			}
		} catch (CloneNotSupportedException e)
		{
			System.out.println("exception output:"+e.getMessage());
		}
		
	}

}
