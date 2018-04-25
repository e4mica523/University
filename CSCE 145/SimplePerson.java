
public class SimplePerson
{
	private String name;

	public SimplePerson() //default constructor
	{
		name = "No Name";
	}
	
	public SimplePerson(String aName) //parameter constructor
	{
		setName(aName);
	}
	
	//accessors and mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
   
    public boolean hasSameName(SimplePerson Person) //checks name
    {
        return this.name.equalsIgnoreCase(Person.name);
    }
	

}
