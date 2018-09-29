package staticMethod1;

public class Student1
{
	int rollno;  
    String name;  
    static String college = "ITS"; 
    
    static void changeVariable()
    {
    	college="kist";
    }
    public Student1(int r,String n) 
    {
    	rollno=r;
    	name=n;
    }
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }
    @Override
    public String toString()
    {
    	return "info:"+rollno+" "+name+" "+college;
    }

	public static void main(String[] args) 
	{
		Student1.changeVariable();
		Student1 s1=new Student1(101, "purushottam");
		Student1 s2=new Student1(102, "dipu");
		Student1 s3=new Student1(103, "kumar");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
