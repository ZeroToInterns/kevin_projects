public class ElectronicStore 
{
	
	
//	public static void getPrice(String product)
//	{
//		Double price;
//		if(product.equals("Ipad"))
//		{
//			price = 900.0;
//		}
//		else if(product.equals("MacBook"))
//		{
//			price = 1200.0;
//		}
//		else if(product.equals("TV"))
//		{
//			price = 800.0;
//		}
//		else if(product.equals("Phone"))
//		{
//			price = 500.0;
//		}
//		else
//		{
//			price = 300.0;
//		}
//		System.out.println(price);
	public static double getPrice(String product, boolean damaged)
	{ 
		double price;
			if(product.equals("MacBook"))
			{
				price = 1000.99;
			}
			else if(product.equals("IPhone"))
			{
				price =  899.9;
			}
			else if(product.equals("Charger"))
			{
				price =  19.99;
			}
			else if(product.equals("IPad"))
			{
				price =  699.99;
			}
			else if(product.equals("TV"))
			{
				price =  2000.99;
			}
			else 
			{
				price =  0;
			}
			if(damaged == false)
			{
				return price;
			}
			else 
			{
				return price * 0.5;
			}
		
}
}
		
	

