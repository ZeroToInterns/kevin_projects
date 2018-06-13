public class SubSandwich 
{
	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	private int type;
	private int size;
	private boolean extra;
	
	public SubSandwich(int theType, int theSize, boolean extraMeat)
	{
		type = theType;
		size = theSize;
		extra = extraMeat;
		if(type != CHICKEN && type != PASTRAMI)
		{
			type = PASTRAMI;
		}
		if(size != 6 && size != 12)
		{
			size = 12;
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void setSize(int newSize)
	{
		size = newSize;
		if(size != 6 && size != 12)
		{
			size = 12;
		}
	}
	
	public boolean isExtraMeat()
	{
		if(extra == true)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public String getType()
	{
		String meatType = "";
		if(type == 0)
		{
			meatType = "chicken";
		}
		else if(type == 1)
		{
			meatType = "pastrami";
		}
		return meatType;
	}
	
	public double getCost()
	{
		double price = 0;
		if(size == 6)
		{
			if(type == 0)
			{
				price = 5.50;
			}
			else
			{
				price = 6.95;
			}
		}
		else
		{
			if(type == 0) 
			{
				price = 8.95;
			}
			else
			{
				price = 9.50;
			}
		}
		if(extra == true)
			   price = price + 1.50;
		return price;
	}
}
