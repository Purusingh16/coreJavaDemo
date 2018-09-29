package training3;

public class SubParent extends Parent 
{
	
	
	public SubParent(double price,double item_count,double rate_per_item)  
	{
		super(item_count, rate_per_item,price);
		
	}
	@Override
	public double calculate_Price(double discount) 
	{
		return item_count*rate_per_item-discount;
//		return super.calculate_Price(discount);
	}
}
