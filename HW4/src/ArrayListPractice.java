import java.util.*;
public class ArrayListPractice 
{
	public static void main(String[] args) 
	{
		ArrayList<String> colorlists = new ArrayList<String>();
		colorlists.add("Red");
		colorlists.add("Blue");
		colorlists.add("Yellow");
		colorlists.add("Purple");
		colorlists.add("Purple");
		colorlists.add("Purple");
		colorlists.add("Purple");
		colorlists.add("White");
		colorlists.add("Black");
		colorlists.add("Gray");
		
		insertFirst(colorlists, "Rainbow");
		System.out.println(colorlists);
		
		addSecondToLast(colorlists, "Majenta");
		System.out.println(colorlists);
		
		colorlists.add("Purple");
		numOfElements(colorlists, "Purple");
		
		replace(colorlists, "Purple", "Pink");
		System.out.println(colorlists);
		
		
	}
	
	public static void insertFirst(ArrayList<String> list, String color)
	{
		list.add(0, color);
	}

	public static void addSecondToLast(ArrayList<String> list, String color)
	{
		list.add(list.size() - 1, color);
	}
	
	public static void numOfElements(ArrayList<String> list, String color)
	{
		int count = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).equalsIgnoreCase(color))
			{
				count++;
			}
		}
		System.out.println(count);
	}	
	public static void replace(ArrayList<String> list, String color, String replacecolor)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).equals(color))
			{
				list.set(i, replacecolor);
			}
		}
	}
}
