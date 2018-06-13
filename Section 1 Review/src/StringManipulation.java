import java.util.*;

public class StringManipulation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //Creates scanner input object
		System.out.print("Enter your full name: ");
		String answer = in.nextLine();
		System.out.println(answer.substring(0,1)); //Prints first letter of name
		System.out.println(answer.substring(0, answer.indexOf(" "))); //Prints first name
	    System.out.println(answer.substring(answer.indexOf(" ") + 1, answer.length()));	//Prints last name
	    System.out.println(answer.substring(4,8)); //Prints the letters of the set index
		
	}
	
}
