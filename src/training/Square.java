package training;

public class Square implements Shape 
{
	private double side;
	
	public Square(double side)
	{
		this.side=side;
		
	}

	@Override
	public double calculateArea() 
	{
		return side*side;
	}

	@Override
	public String getInfo() {
		return "info="+this.side;
	}

}
