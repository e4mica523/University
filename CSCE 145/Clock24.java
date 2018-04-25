
public class Clock24
{
	//parameters
	private int hours;
	private int minutes;
	private boolean isAm;
	
	public Clock24() //default constructor
	{
		super();
		setHours(0);
		setMinutes(0);
		setAm(true);
	}

	public Clock24(int hours, int minutes) //parameterized constructor
	{
		super();
		setHours(hours);
		setMinutes(minutes);
	}

	//accessors and mutators
	public int getHours()
	{
		return hours;
	}

	public void setHours(int hours)
	{
		if(hours < 0)//if negative, output an error
		{
			System.out.println("Error! Negative time!");
			System.exit(0);
		}
		else
		{	
			this.hours = hours;
		}	
	}

	public int getMinutes()
	{
		return minutes;
	}

	public void setMinutes(int minutes)
	{
		if(minutes < 0)
		{
			System.out.println("Error! Negative time!");
			System.exit(0);
		}
		else
		{	
			this.minutes = minutes;
			
		}	
	}

	public boolean isAm()
	{
		return isAm;
	}

	public void setAm(boolean isAm)
	{
		this.isAm = isAm;
	}
	
	public void setTime(int hours, int minutes) throws TimeFormatException
	{
		if(hours > 24 || hours < 0)
		{
			throw new TimeFormatException("EXCEPTION! Invalid Hours!");
			//if invalid, throw error
		}
		else if(minutes > 60 || minutes < 0)
		{
			throw new TimeFormatException("EXCEPTION! Invalid Minutes!");
			//if invalid, throw error
		}
		else
		{
			if(hours == 24)
			{
				hours = 0;
				isAm = true;
				
			}
			else if(hours > 12)
			{
				hours -= 12;
				isAm = false;
			}
			else if(hours == 12)
			{
				isAm = false;
			}
			else
			{
				this.isAm = true;		
			}
			this.hours = hours;
			this.minutes = minutes;
			
		}
	}
	
	public void setTime(String time) throws TimeFormatException
	{
		String[] subs = time.split(":");
		int h = -1;
		int m = -1;
		try
		{
			h=Integer.parseInt(subs[0]);
			m=Integer.parseInt(subs[1]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception! Incorrect Format");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception! Incorrect Format");	
		}
		this.setTime(h,m);
		
	}
	
	public void printTime()
	{
		String a = (this.isAm) ? "AM" : "PM";
		if(minutes < 10)
		{	
			System.out.println(this.hours + ":" + "0" + this.minutes +" " +a);
		}
		else
		{
			System.out.println(this.hours + ":" + this.minutes +" " +a);
		}	
	}

}
