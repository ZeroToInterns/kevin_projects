import java.util.*;

public class InputApplication 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //Creates a scanner object
		System.out.print("Enter a your favorite dessert: "); 
		String answer = in.nextLine(); //Takes in a String input
		System.out.println(answer.substring(answer.length()-1)); //Prints the last character
		System.out.print("Enter a double: "); //Takes in a Double input
		double answer2 = in.nextDouble();
		System.out.print("Enter an integer: "); //Takes in a Integer Input
		int answer3 = in.nextInt();
		double product = answer2 * answer3;
		System.out.println("Product: " +  product);
		System.out.print("Integer portion: " + (int) product);
		
	}
}
