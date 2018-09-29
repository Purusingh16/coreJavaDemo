package objectClass;

public class Object 
{

	public static void main(String[] args) 
	{
		Object o1=new Object();
		Object o2=new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		if(o1.equals(o2))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
//		StringBuffer ob1=new StringBuffer();
		o1=o2;
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		if (o1.equals(o2)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
	}

}
