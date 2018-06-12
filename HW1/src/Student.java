
public class Student 
{
	private String name;
	private double GPA;
	
	public Student(String myName, double myGPA)
	{
		name = myName;
		GPA = myGPA;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;		
	}
	
	public double getGPA ()
	{
		return GPA;
	}
	
	public void changeGPA(Double newGPA)
	{
		GPA = newGPA;
	}
}
