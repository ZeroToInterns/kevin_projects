import java.util.*;
public class ArrayChallenge 
{
	public static void main(String[] args)
	{
//		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
//		int[] result = reverseArray(myArray); //Sets the method to an array
//		for(int i = 0; i < result.length; i++) //Prints the array
//		{
//			System.out.print(result[i] + " ");
//		}
//		int[] myArray2 = {2,4,3,4,1,2,2};
//		int[] result2 = removeDuplicates(myArray2);
//		for(int i = 0; i < result2.length; i++) //Prints the array
//		{
//			System.out.print(result2[i] + " ");
//		}
		int[] myArray3 = {2,2,2,2,4,5,6,6,8};
		int result3 = countMostFrequent(myArray3);
		System.out.println(result3);
	}
	
	public static int[] reverseArray(int[] array)
	{
		Stack<Integer> myStack = new Stack<Integer>();
		int[] temp = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{
			myStack.push(array[i]);
		}
		for(int i = 0; i < array.length; i++) 
		{
			temp[i] = myStack.pop();
		}
		return temp;
	}
//		for(int i = 0; i < array.length/2; i++)
//		{
//			int temp = array[i];
//			array[i] = array[array.length - i - 1];
//			array[array.length - i - 1] = temp;
//		}
//	}
//	
	public static int[] removeDuplicates(int[] array) 
	{
		TreeSet<Integer> mySet = new TreeSet<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>(); //Converting to ArrayList to get rid of the zeros that are in the array when it skips duplicates
		for(int i = 0; i < array.length; i++)
		{
			if(mySet.add(array[i]))
			{
				//we have not added this number yet
				temp.add(array[i]);
			}
			else
			{
				//this number is a duplicate
			}
		}
		int[] result = new int[temp.size()]; //Converts the arraylist to an array
		for(int i = 0; i < temp.size(); i++)
		{
			result[i] = temp.get(i);
		}
		return result;
	}
	
	public static int countMostFrequent(int[] array)
	{
		int[] count = new int[51];
		for(int i = 0; i < array.length; i++)
		{
			count[array[i]]++; //Counts how times the number at position i in the array appears in the array and stores the count in the count array
		}
		int max = 0;
		int result = 0;
		for(int i = 0; i < count.length; i++) //Then find the count that has the largest value in the count array;
		{
			if(count[i] > max)
			{
				max = count[i];
				result = i;
			}
		}
		return result;
	}
}