
public class Person 
{
	private static final int MY_CONSTANT = 123456789;
//	//instance variables
	private static String name = "Kevin";
	private static int age = 19;
	private static String hairColor = "Black";
	private static double weight = 145;
	private static String height = "5'4";
	private static char gender = 'M';
	
	public Person() 
	{
		System.out.println("Created a new person");
	}
	
			
	public static void main(String[] args)
	{
		Person myPerson = new Person();
		myPerson.hairColor = "Brown";
		hairColor = "Blue";
		Person person2 = new Person();
		System.out.println(myPerson.MY_CONSTANT);
	}

	//example of local variables and scope
	public void printVariables() {
		System.out.println(name);
		String myName = "Michael";
	}
}
