package training3;

public class Result
{
	int result;
	
	public Result() 
	{
		System.out.println("default constructor!!");
	}
	public Result(int a,int b)
	{
		this();
		this.result=a+b;
	}
	public Result(int a,int b,int c)
	{
		this(a,b);
		this.result=result+c;
	}
	public Result(int a,int b,int c,int d)
	{
		this(a,b,c);
		this.result=result+d;
	}
	public Result(int a,int b,int c,int d,int e)
	{
		this(a,b,c,d);
		this.result=result+e;
	}
	public String toString()
	{
		return "Result:"+result;
	}
	
	public static void main(String[] args)
	{
		Result rs=new Result(10,20,30,40,50);
//		System.out.println("result:"+rs.result);
		System.out.println(rs);
		Result rs1=new Result(10,20,30);
		System.out.println("result:"+rs1.result);
		Result rs2=new Result(10,20,30,40);
		System.out.println("result:"+rs2.result);
		Result rs3=new Result(10,20,30,40,50);
		System.out.println("result:"+rs3.result);
		
	}

}
