
public class Employee extends SimplePerson
{
	
	//parameters that Employees have
	private double annualSalary;
	private String hireDate;
	private int idNumber;
	
	public Employee() //default constructor
	{
		super();
		annualSalary = 0.0;
		hireDate = "Not Hired";
		idNumber = 0;
	}

	public Employee(String aName, double annualSalary, String hireDate, int iDNumber) //constructor with parameters
	{
		//sets all the values
		super(aName);
		setAnnualSalary(annualSalary);
		setHireDate(hireDate);
		setIdNumber(iDNumber);
	}

	//accessors and mutators with checks
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double newSalary) //salary
	{
		if(newSalary > 0)
		{	
			this.annualSalary = newSalary;
		}	
		else
		{
			System.out.println("Error. Not Valid Salary");
			System.exit(0);
		}
	}

	public String getHireDate() { //hire date
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		if(hireDate.contains("/"))
		{
			this.hireDate = hireDate;
		}
		else
		{
			System.out.println("Error. Not valid Date");
			System.exit(0);
		}
		
		
	}

	public int getIdNumber() { //id
		return idNumber;
	}

	public void setIdNumber(int newNumber)
	{
		if(newNumber > 0)
		{	
			this.idNumber = newNumber;
		}	
		else
		{
			System.out.println("Error. Not valid ID");
			System.exit(0);
		}
	}

	public void writeOutput( ) //output method
    {
        
		super.writeOutput();
		System.out.println("Annual Salary: " + getAnnualSalary());
        System.out.println("Hire Date: " + getHireDate());
        System.out.println("ID Number: " + getIdNumber( ));
    }
   
	 public boolean equals(Employee otherEmployee) //equals method
	 {
		 return super.hasSameName(otherEmployee) &&
	       (this.idNumber == otherEmployee.idNumber) &&
	       (this.annualSalary == otherEmployee.annualSalary) &&
	       (this.hireDate.equals(otherEmployee.hireDate));
	 }
	
	 
}
