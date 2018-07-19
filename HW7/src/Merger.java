import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class Merger 
{
	private static LinkedList<Integer> merge(LinkedList<Integer> first, LinkedList<Integer> second)
	{
		LinkedList <Integer> list = new LinkedList<Integer>();
		
		Iterator<Integer> it1 = first.iterator();
        Iterator<Integer> it2 = second.iterator();
        Iterator merging = merged.listIterator();
        int x1 = (int)it1.next();
        int x2 = (int)it2.next();
        
		while (true) 
		{
			if( x1 <= x2)
			{
				merged.add(x1);
				if(it1.hasNext())
				{
					x1 = (int)it1.next();
				 }
			}
		}
	}
	 public static void main(String args[])
	 {
	        Integer values1[] = { 4, 16, 26, 29, 32, 47, 50, 79, 83, 86, 97};
	        Integer values2[] = {14, 16, 18, 54, 61, 63, 64, 88, 92};
	        
	        LinkedList<Integer> first  = new LinkedList<Integer>(Arrays.asList(values1));
	        LinkedList<Integer> second = new LinkedList<Integer>(Arrays.asList(values2));
	        
	        System.out.println("First  " + first);
	        System.out.println("Second " + second);
	        System.out.println("Merged " + merge(first, second));
	  }
}
