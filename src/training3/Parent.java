package training3;

public class Parent 
{
	double item_count;
	double rate_per_item;
	double price;
	
	public Parent(double item_count,double rate_per_item,double price) 
	{
		this.price=price;
		this.item_count=item_count;
		this.rate_per_item=rate_per_item;
	}
	public double  calculate_Price(double discount)
	{
		return item_count*rate_per_item-discount;
		
	}

}
