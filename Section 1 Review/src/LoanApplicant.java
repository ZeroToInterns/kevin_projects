public class LoanApplicant 
{
	private double salary;
	private int years;
	
	public LoanApplicant(double annualSalary, int yearsOnJob)
	{
		salary = annualSalary;
		years = yearsOnJob;
	}
	
	public boolean qualifies()
	{
		boolean qualify = false;
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
		return qualify;
		
	}
	
	public void setYearsOnJob(int years)
	{
		this.years = years;
	}
	
	public int getYearsOnJob()
	{
		return years;
	}
	
	public void setAnnualSalary(double salary)
	{
		this.salary = salary;
	}
	
}
