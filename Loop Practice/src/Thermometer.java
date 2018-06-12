
public class Thermometer 
{
	private int temperature;
	public void raiseTemp()
	{
		if(temperature < 90)
		{
			while(temperature < 90)
				{
					temperature++;
				}
		}
		else if (temperature == 90)
		{
			temperature = 90;
		}
		else
		{
			while(temperature > 90)
			{
				temperature--;
			}
		}
		
	}
	}

