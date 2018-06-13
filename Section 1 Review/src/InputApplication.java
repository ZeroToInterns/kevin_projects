import java.util.*;

public class InputApplication 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a your favorite dessert: ");
		String answer = in.nextLine();
		System.out.println(answer.substring(answer.length()-1));
		System.out.print("Enter a double: ");
		double answer2 = in.nextDouble();
		System.out.print("Enter an integer: ");
		int answer3 = in.nextInt();
		double product = answer2 * answer3;
		System.out.println("Product: " +  product);
		System.out.print("Integer portion: " + (int) product);
		
	}
}
