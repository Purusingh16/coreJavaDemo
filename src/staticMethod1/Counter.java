package staticMethod1;

public class Counter
{
	int count=0;//will get memory when instance is created 
	
	public Counter()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
	}

}
