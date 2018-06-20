public class GroceryList 
{
	private String[] groceryList; //creates an empty array
	
	public GroceryList()
	{
		groceryList = new String[50];
	}
	
	public GroceryList(int length)
	{
		groceryList = new String[length];
	}
	
	public GroceryList(String[] list) //A initialized array with items that is passed in
	{
		groceryList = new String[list.length];
		for(int i = 0; i < list.length; i++)
		{
			groceryList[i] = list[i]; //sets the empty positions in groceryList array to items in  list array
		}
	}
	
	public int findLongestItem()
	{
		int longest = 0;
		for(int i = 0; i < groceryList.length; i++)
		{
			if(groceryList[i].length() > longest)
			{
				longest = groceryList[i].length();
				
			}
		}
		return longest;
	}
	
	public int findShortestItem()
	{
		int shortest = groceryList[0].length();
		for(int i = 0; i < groceryList.length; i++)
		{
			if(groceryList[i].length() < shortest)
			{
				shortest = groceryList[i].length();
				
			}
		}
		return shortest;
	}
	
}
