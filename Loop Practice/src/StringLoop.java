
public class StringLoop 
{
//	public void printHundred()
//	{	
//			for(int i = 0; i <= 100; i++)
//			System.out.println("The loop value is - " + i);
//	}
//	
//	public void printEven()
//	{
//		for(int i = 0; i <= 100; i+=2)
//		{
//			System.out.println("The loop value is - " + i);
//		}
//	}
	
	//using the loop count variable to find the loop string 
	//Using modified  for loops to iterate over the entire string
	//error because string is not a subclass of Collection
//	public int countNumberOfO(String word) 
//	{
//		int counto = 0;
//		for(String element: word)
//		{
//			if(element.equalsIgnoreCase("o"))
//			{
//				counto++;
//			}
//		}
//		return counto;
//	}
	
//	public void printWorld(String word)
//	{
//		for(int i = 0; i < word.length(); i++)
//		{
//			for(int j = 0; j < i + 1; j++)
//			{
//				System.out.print(word.substring(i, i+1));
//			}
//			System.out.println("");
//		}
//	}
	
	public void printString(String word)
	{
		try 
		{
			for(int i = 0; i < word.length() + 1; i++)
			{
				System.out.print(word.substring(i,i+1));
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}

