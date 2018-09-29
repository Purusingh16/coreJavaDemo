package training;

public class Main {

	public static void main(String[] args) 
	{
		Shape s=new Traingle(10, 20);
		System.out.println(s.getInfo()+", Area="+s.calculateArea());
		Shape s1=new Square(10);
		System.out.println(s.getInfo()+", Area="+s1.calculateArea());
		Shape s2=new Traingle(5, 10);
		System.out.println(s.getInfo()+", Area="+s2.calculateArea());

	}

}
