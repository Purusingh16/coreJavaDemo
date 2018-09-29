package nonStaticBlock;

public class Demo 
{
	int i;
	{
		i+=5;
		System.out.println(i);//5
	}
	Demo()
	{
		i*=2;
		System.out.println(i);//50
	}
	{
		i*=5;
		System.out.println(i);//25
	}

	public static void main(String[] args)
	{
		Demo dd=new Demo();
		System.out.println(dd.i);
		
		
	}

}
