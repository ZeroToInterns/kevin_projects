public class Person implements Comparable, Speakable
{
	private String name;
	private double GPA;
	public int age;
	
	@Override
	//create a compareTo method that compares people by age
	public int compareTo(Object otherPerson) 
	{
		Person person = (Person) otherPerson;
		if(age < person.age)
		{
			return -1;
		}
		else if (age > person.age)
		{
			return 1;
		}
		return 0;
	}
	
	public void speak()
	{
		System.out.println("Hello my Name is Kevin");
	}
}
