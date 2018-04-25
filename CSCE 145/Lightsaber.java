
public class Lightsaber
{
	//variables for the three parameters
	private String color;
	private boolean isOn;
	private double bladeLength;
	
	public Lightsaber() //default constructor
	{
		color = "None";
		isOn = false;
		bladeLength = 0.0;
	}
	
	public Lightsaber(String aColor, boolean activate, double length) //parameterized constructor
	{
		setColor(aColor);
		setIsOn(activate);
		setBladeLength(length);
	}
	
	
	//accessors and mutators
	public String getColor() {
		return color;
	}

	public void setColor(String color) //checks for valid values for color
	{
		if(color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Blue")
				 || color.equalsIgnoreCase("Green")
				 || color.equalsIgnoreCase("Purple"))
		{
			this.color = color;
		}
		else
		{	
			System.out.println("There isn't a known crystal that supports that color"); //error
		}
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean activate) {
		this.isOn = activate;
	}

	public double getBladeLength() {
		return bladeLength;
	}

	public void setBladeLength(double length)
	{
		if(length > 130 && length < 150) //must be within these measurements
		{	
			this.bladeLength = length;
		}
		else
		{
			System.out.println("This is not a correct blade length");
		}
	}

	public String toString() //to string to output
	{
		return "Lightsaber [color=" + color + ", isOn=" + isOn
				+ ", bladeLength=" + bladeLength + ", getColor()=" + getColor()
				+ ", getIsOn()=" + getIsOn() + ", getBladeLength()="
				+ getBladeLength() + "]";
	}

	public boolean equals(Lightsaber e) //equals method for comparing
	{
		if(this.getColor() == e.getColor())
		{
			if(this.getIsOn() == e.getIsOn())
			{
				if(this.getBladeLength() == e.getBladeLength())
				{
					return true;
				}
			}
		}	
		return false;
		
	}
	
	
	
	

}
