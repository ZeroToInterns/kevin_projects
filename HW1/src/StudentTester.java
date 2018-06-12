
public class StudentTester 
{
	public static void main(String[] args)
	{
		Student myStudent = new Student("Michael", 4.0);
		System.out.println(myStudent.getName());
		myStudent.setName("Mike");
		System.out.println(myStudent.getGPA());
		myStudent.changeGPA(3.9);
		System.out.println(myStudent.getGPA());
	}
	
}
