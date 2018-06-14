public class LoanApplicant 
{
	private double salary;
	private int years;
	
	public LoanApplicant(double annualSalary, int yearsOnJob) //Creates a customized LoanApplicant with salary and job
	{
		salary = annualSalary;
		years = yearsOnJob;
	}
	
	public boolean qualifies() //Checks to see if the applicant qualifies for the loan
	{
		boolean qualify = false; //Initiali qualify is se to false
		if(salary > 100000.0)
		{
			qualify = true;
		}
		else if((salary <= 100000.0 && salary > 50000.0) && years >= 2)
		{
			qualify = true;
		}
		else if((salary <= 50000.0 && salary > 30000.0) && years >= 5)
		{
			qualify = true;
		}
		else
		{
			qualify = false;
		}
		return qualify; //Returns T or F to see if the applicant qualifies
		
	}
	
	public void setYearsOnJob(int years) //Sets new years the applicant has worked on the job
	{
		this.years = years;
	}
	
	public int getYearsOnJob() //Gets how many years the applicant has worked on the job
	{
		return years;
	}
	
	public void setAnnualSalary(double salary) //Sets a new salary of the applicant
	{
		this.salary = salary;
	}
	
}
