package typecasting;
class Base
{
	String name;
	int roll;
}
class Child extends Base
{
	Base display(String s,int r)
	{
		Child ch=new Child();
		ch.name=s;
		ch.roll=r;
		return ch;
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		Child ch=new Child();
		Child ch1=(Child) ch.display("raj",101);
		System.out.println(ch.name+"\t"+ch.roll);
		System.out.println(ch1.name+"\t"+ch1.roll);
	}

}
