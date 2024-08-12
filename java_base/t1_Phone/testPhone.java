package t1_Phone;

public class testPhone
{
	public static void main(String[] args)
	{
		Phone target = new Phone();
		String brand="小米",color="黑色";
		double price=3998;
		target.setBrand(brand);
		target.setPrice(price);
		target.setColor(color);
		target.call();
		target.sendMessage();
		
		
	}
}



