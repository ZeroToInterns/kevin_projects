
public class Tester {
	
private static String determineGender(char gender)
{
	String result;
	if(gender == 'M')
	{
		result = "It's a Male ";
	}
	else if(gender == 'F')
	{
		result = "It's a Female";
	}
	else
	{
		result = "Error: Invalid ";
	}
	return result;
	}

public static void chooseRoom (String newAnimal, boolean sick, char gender)
{
	if(sick)
	{
		System.out.println("We cannot accept this animal");
}
else
{
 if((newAnimal.equals("dog") || newAnimal.equals("Dog")))
{	
		System.out.println(determineGender(gender) + "dog");
}
else if((newAnimal.equals("Cat") || newAnimal.equals("cat")))
{	
	System.out.println(determineGender(gender) + "cat");
}
else if((newAnimal.equals("Zebra") || newAnimal.equals("zebra")))
{
	System.out.println(determineGender(gender) + "zebra");
}
else 
{	
		System.out.println("We don't accept this animal");	
}
}
}


public static void main(String[] args) {
	
//		double temperature = 77.5;
//		if(120 >= temperature && temperature >= 77.5)
//		{
//			System.out.println("It's Hot");
//		}
//		else if (77.5 > temperature && temperature >= 15)
//		{
//			System.out.println("It's warm");
//		}
//		else if(15 > temperature && temperature >= -30)
//		{
//			System.out.println("It's Cold");
//		}
//		else
//		{
//			System.out.println("It's a recorder breaker");
//		}
//
//	}
chooseRoom("Dog",false,'M');
chooseRoom("Cat",true,'F');
chooseRoom("Zebra",false,'M');
chooseRoom("Fish",true,'M');
}
	}
