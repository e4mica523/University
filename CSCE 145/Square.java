
public class Square 
{
	private int length;
	
	public Square() //default constructor
	{
		length = 0;
	}
	
	public Square(int aLength) //parameterized constructor
	{
		try //try to call the mutator to change length
		{
			setLength(aLength);
		}
		catch(DimensionException e)
		{
			System.out.println("Exception! Incorrect Format"); //throw the error
		}
	}

	public int getLength() //returns the length for accessor
	{
		return length;
	}

	public void setLength(int length) throws DimensionException //mutator for the length with error check
	{
		if(length < 1) //length must be at least 1
		{
			throw new DimensionException("Exception! Length must be at least 1!");
		}
		else
		{	
			this.length = length;
		}	
	}
	
	public void draw()
	{
		//make draw method
		for(int i = 0; i < length; i++) //row
		{
			for(int j = 0; j < length; j++) //column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getArea() //calculates the area
	{
		int area = this.length * this.length;
		return area;
	}
	
	public int getPerimeter() //calculates the perimeter
	{
		int perimeter = this.length * 4;
		return perimeter;
	}
	


}
