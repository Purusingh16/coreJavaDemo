package objectClass;

public class Dynamic {

	public static void main(String[] args) 
	{
		String s1=new String("java");
		String s2=new String("java");
		
		System.out.println(s1.hashCode()+"\n"+s2.hashCode());
		if (s1.equals(s2)) 
		{
			System.out.println("equals");
		} else 
		{
			System.out.println("not equals");
		}
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		
		System.out.println(sb1.hashCode()+"\n"+sb2.hashCode());
		if (sb1.equals(sb2))
		{
			System.out.println("equals");
		} 
		else
		{
			System.out.println("not equals");
		}
	}

}
