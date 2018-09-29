package reference;

public class Text 
{
	String name;
	int roll;
	double fee;

	public static void main(String[] args) 
	{
		Text tt;//tt is a reference of text class
		tt=new Text();//here tt is refers but it holds base address of text class object
		tt.name="Amit";
		tt.roll=15;
		tt.fee=45522.99;
		System.out.println("Name is:"+tt.name+"\nRoll number is:"+tt.roll+"\nFee is:"+tt.fee);
	}

}
