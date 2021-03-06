import java.util.*;
public class LoopFun 
{
	public int getPermutationCount(int n)
	{
		if(n <= 0) //If the number input is zero or negative 
		{
			return 0; //Give back zero
		}
		else
		{   
			int factorial = 1; //set initial value to 1;
			for(int i = 1; i <= n; i++)
			{
				factorial = factorial * i; //Calculates factorial
			}
			return factorial;
		}
	}
	
	public String removeDuplicates(String word)
	{
		String newWord = ""; //Creates an empty String to add in letter
		if(word.equals("")) 
		{
			throw new NullPointerException(); //Throws in an exception if the String is empty
		}
		
		for(int i = 0; i < word.length(); i++) //Goes through the word
		{
			String currentLetter = word.substring(i,i+1);// Checks the current position
			if(!(newWord.contains(currentLetter))) //checks to see if letter is currently in newWord string
			{
					newWord += word.substring(i,i+1); //if not add in the letter
			}	
		}
		return newWord;
	}	
	
	public double sumSeries(int n)
    {
        double term1 = 2; //Sets the initial term to 2
        double sum = 0; //Sets the sum of the geometric sequence to 0
        for(int  i = 1; i <= n; i++) //Intialize i to 1, makes sure i will no go over count, increase i by 1 for every time the body executes
        {
            sum = sum + term1; //Updates the sum by the term in the geometric sequence
            term1 = term1 * (0.5); //Updates the term1 by 0.5 each time it increments
        }
        return sum;
    }
	
	public int product (int n)
    {
        int product = 1; //Initializes producet to 1;
        int num; //Creates an empty num variable to store user input
        Scanner in = new Scanner(System.in); //Creates a scanner for user input
        if (n == 0) //Checks to see if n is equal to 0
        {
            return 0; //if n is 0 return 0 
        }
        else if (n < 0) //Checks to see if n is neagtive
        {
            return -1; //if n is negative return -1
        }
        for(int i = 1; i <= n; i++) //Initialize count to 1, makes sure i does not exceed the user input, increments count by 1 everytime the body loops
        {
            System.out.print("Enter integer " + i + ": "); //Prints out a sentence that 
            num = in.nextInt(); //Intialize the empty num variable to the user input
            product = product * num; //Updates the product by the num that is inputed 
        }
        return product;
    }
	
	//Find the greatest power by 2 that doesn't exceed or equal the inputted value
	public int largestPowerLessThan(int value)
	{
		int x = 1; //Sets initial count to 1
		if(value == 1 || value <= 0) //Makes sure that the power cannot be 0 or negative
		{
			return -1;
		}
		while((int)Math.pow(2, x) < value) //Makes sure that the power does not exceed the value
		{
			x = x + 1;
		}
		
		return x - 1; //returns the power
	}
	
//	public int largestPowerLessThan(int value)
//	{
//		int x = 2;  
//		if(value <= 1)
//		{
//			return -1;
//		}
//        while (x < value) 
//        {
//        	x = x * 2;
//       	}
//
//        return (int)Math.sqrt(x);
//	}
//	
	
	public int sumOdd(int value) //Calculates the sum of each odd value for a number
	{	
		int sum = 0; 
		if(value < 0) //Makes sure that the value is a valid number
		{
			System.out.println("Enter a valid number");
		}
		for(int i = 1; i < value; i+=2) //Increments the value by 2 to get odd numbers
		{
			sum = sum + i; //Finds the sum of the odd number
		}
		return sum;
	}
	
	public int getECount(String word) //Gets the number of letter e in a string
	{
		int ecount = 0;
		for(int i = 0; i < word.length(); i++) //Goes through the string
		{
			if(word.substring(i,i+1).equalsIgnoreCase("e")) //Checks the current position of the string to see if it is a string
			{
				ecount++; //increment the count of e
			}
	    }
		return ecount; //gets the count of e
	}
}
