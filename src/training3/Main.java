package training3;

public class Main {

	public static void main(String[] args)
	{
		Parent p=new Parent(10, 5, 100);
		System.out.println("parent cal_price:"+p.calculate_Price(10));
		
		Parent p1=new SubParent(100, 10, 5);
		System.out.println("child cal_price:"+p1.calculate_Price(20));
	}

}
