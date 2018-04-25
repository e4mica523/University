
public class Diamond extends ShapeBasics implements DiamondInterface
{
	int width;
	
	public Diamond() //default constructor
	{
		super();
		setWidth(0);
	}
	
	public Diamond(int width, int offset) //constructor with parameters
	{
		super(offset);
		if(width < 0 || offset < 0)
		{
			System.out.println("Error! Negative Numbers");
			System.exit(0);
		}
		if(width % 2 == 0)
		{
			System.out.println("Error Even Width");
			System.exit(0);
		}
		else
		{	
			setWidth(width);
		}	
	}

	//accessors and mutators
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void drawHere() //draw here method calls each half of the diamond
	{
		drawTopV();
		skipSpaces(getOffset());
		System.out.print("*");
		skipSpaces(2*(width/2)-1);
		System.out.println("*");
		drawBottomV();
		System.out.println();
	}
	
	private void drawTopV() //draws top
	{
		
		for(int i=0; i<width/2; i++)
	    {
	    //print spaces.
	    	skipSpaces(getOffset()+(width/2-i));
	    	System.out.print("*");
	    	if(i!=0)
	    	{
	            skipSpaces(2*i-1);
	            System.out.print("*");
	    	}
	            System.out.println();
	    }
	}
	
	private void drawBottomV() //draw bottom
	{
		
		for(int i=width/2; i>0; i--)
		{
			skipSpaces(getOffset()+(width/2-i+1));
			System.out.print("*");
			if(i!=1)
			{
				skipSpaces(2*i-3);
				System.out.print("*");
			}
	            System.out.println();
		}
	}
	
	private static void skipSpaces(int number) //skips spaces in the diamond
    {
        for (int count = 0; count < number; count++)
            System.out.print(" ");
    }

}

