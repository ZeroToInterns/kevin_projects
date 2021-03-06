public class ControlFlowPractice 
{
	public double calculateCost(double distance)
	{		
		double price = 0;
		if(distance >= 50)
		{
			price = 100.0;
		}		
		else if(distance >= 25 && distance < 50)
		{
			price = 50.0;
		}
		else if(distance >= 0 && distance < 25)
		{
			price = 10.0;
		}
		else
		{
			price = 0;
		}
		return price;
	}

	
//	public void rollDice(int value)
//	{
//		switch(value)
//		{
//		case 1:
//			System.out.println("The value rolled is: "  + value);
//			break;
//		case 2: 
//			System.out.println("The value rolled is: "  + value);
//			break;
//		case 3:
//			System.out.println("The value rolled is: "  + value);
//			break;
//		case 4:
//			System.out.println("The value rolled is: "  + value);
//			break;
//		case 5:
//			System.out.println("The value rolled is: "  + value);
//			break;
//		case 6:
//			System.out.println("The value rolled is: "  + value);
//			break;
//		default:
//			System.out.println("The value rolled is invalid");
//			break;
//		}
//	}
	
//	public void findLetterAt(int index, String word)
//	{
//		for(int i = 0; i < word.length(); i++)
//		{			
//			if(word.indexOf(word.charAt(i)) == index)
//			{
//				System.out.println(word.charAt(index));
//			}
//		}
//	}

	public int findLetter(String letter, String word)
	{
		int count = 0;
		//loop ends where the index indicates
		for(int i = 0; i < word.length(); i++)
		{
			//if the current letter we are at matches the letter
			if(word.substring(i, i+1).equals(letter))
			{
				//if we already incremented count once, return the index
				if(count == 1)
				{
					return i;
				}
				//increment the count, this is the first time we saw this letter
				else			{
					count++;
				}
			}
		}
		//There are not two of the letters in the string
		return 0;
	}
	
}